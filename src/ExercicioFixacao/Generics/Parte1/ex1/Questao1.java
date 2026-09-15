package ExercicioFixacao.Generics.Parte1.ex1;

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}

public class Questao1 {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Idade", 25);
        System.out.println(p.getFirst() + ": " + p.getSecond());
    }
}