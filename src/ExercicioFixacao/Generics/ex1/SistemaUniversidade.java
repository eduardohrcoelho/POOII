package ExercicioFixacao.Generics.ex1;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

abstract class Entidade {
    private String id;
    public Entidade(String id) { this.id = id; }
    public String getId() { return id; }
}

abstract class Pessoa extends Entidade {
    private String nome;
    public Pessoa(String id, String nome) { super(id); this.nome = nome; }
    public String getNome() { return nome; }
    @Override public String toString() { return getNome(); }
}

class Aluno extends Pessoa {
    private double cra;
    public Aluno(String id, String nome, double cra) { super(id, nome); this.cra = cra; }
    public double getCra() { return cra; }
}

class Professor extends Pessoa {
    private String departamento;
    public Professor(String id, String nome, String departamento) { super(id, nome); this.departamento = departamento; }
    public String getDepartamento() { return departamento; }
}

class Funcionario extends Pessoa {
    private String cargo;
    public Funcionario(String id, String nome, String cargo) { super(id, nome); this.cargo = cargo; }
}

class Pair<A, B> {
    public final A first;
    public final B second;
    public Pair(A first, B second) { this.first = first; this.second = second; }
    @Override public String toString() { return "(" + first + ", " + second + ")"; }
}

interface NumericValue<T extends Number> {
    T getValue();
}

class Estatisticas {
    public static <T extends Number> double calcularMedia(GenCollection<? extends NumericValue<T>> collection) {
        return collection.toList().stream()
                .mapToDouble(n -> n.getValue().doubleValue())
                .average()
                .orElse(0.0);
    }
}

class GenCollection<T> {
    private List<T> lista;

    public GenCollection() { this.lista = new ArrayList<>(); }
    public GenCollection(List<T> lista) { this.lista = new ArrayList<>(lista); }

    public void add(T item) { lista.add(item); }
    public void remove(T item) { lista.remove(item); }
    public List<T> toList() { return Collections.unmodifiableList(lista); }

    public GenCollection<T> filter(Predicate<? super T> predicate) {
        List<T> filtrados = lista.stream().filter(predicate).collect(Collectors.toList());
        return new GenCollection<>(filtrados);
    }

    public <R> GenCollection<R> map(Function<? super T, ? extends R> mapper) {
        List<R> mapeados = lista.stream().map(mapper).collect(Collectors.toList());
        return new GenCollection<>(mapeados);
    }

    public GenCollection<T> sort(Comparator<? super T> comparator) {
        List<T> ordenada = new ArrayList<>(this.lista);
        ordenada.sort(comparator);
        return new GenCollection<>(ordenada);
    }

    public <K> Map<K, List<T>> groupBy(Function<? super T, ? extends K> classifier) {
        return lista.stream().collect(Collectors.groupingBy(classifier));
    }

    public <U> GenCollection<Pair<T, U>> zip(GenCollection<U> other) {
        List<Pair<T, U>> zipped = new ArrayList<>();
        List<U> otherList = other.toList();
        int minSize = Math.min(this.lista.size(), otherList.size());
        for (int i = 0; i < minSize; i++) {
            zipped.add(new Pair<>(this.lista.get(i), otherList.get(i)));
        }
        return new GenCollection<>(zipped);
    }

    public static <T> void copy(GenCollection<? extends T> src, GenCollection<? super T> dest) {
        for (T item : src.toList()) dest.add(item);
    }

    public static <T> void merge(GenCollection<? extends T> c1, GenCollection<? extends T> c2, GenCollection<? super T> dest) {
        copy(c1, dest);
        copy(c2, dest);
    }
}

class Pipeline<T> {
    private GenCollection<T> collection;

    public Pipeline(GenCollection<T> collection) { this.collection = collection; }

    public Pipeline<T> filter(Predicate<? super T> predicate) {
        this.collection = this.collection.filter(predicate);
        return this;
    }

    public <R> Pipeline<R> map(Function<? super T, ? extends R> mapper) {
        return new Pipeline<>(this.collection.map(mapper));
    }

    public Pipeline<T> sort(Comparator<? super T> comparator) {
        this.collection = this.collection.sort(comparator);
        return this;
    }

    public GenCollection<T> collect() { return this.collection; }
}

public class SistemaUniversidade {
    public static void main(String[] args) {
        GenCollection<Aluno> alunos = new GenCollection<>();
        GenCollection<Professor> professores = new GenCollection<>();
        GenCollection<Pessoa> todasAsPessoas = new GenCollection<>();

        for (int i = 1; i <= 15; i++) alunos.add(new Aluno("A"+i, "Aluno " + i, 5.0 + (i % 5)));
        for (int i = 1; i <= 10; i++) professores.add(new Professor("P"+i, "Prof " + i, "DCOM"));
        for (int i = 1; i <= 5; i++) todasAsPessoas.add(new Funcionario("F"+i, "Func " + i, "Admin"));

        GenCollection.copy(alunos, todasAsPessoas);
        GenCollection.copy(professores, todasAsPessoas);

        GenCollection<String> nomesOrdenados = new Pipeline<>(todasAsPessoas)
                .filter(p -> p.getNome().startsWith("A"))
                .sort(Comparator.comparing(Pessoa::getNome))
                .map(Pessoa::getNome)
                .collect();

        System.out.println("Nomes ordenados via Pipeline: " + nomesOrdenados.toList());

        Map<String, List<Professor>> profsPorDep = professores.groupBy(Professor::getDepartamento);
        
        GenCollection<Pair<Professor, Aluno>> duplas = professores.zip(alunos);
        System.out.println("Duplas (Orientador-Orientado): " + duplas.toList().get(0));
    }
}
