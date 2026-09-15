package ExercicioFixacao.Generics.Parte1.ex6;

class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    public T getFirst() {
        return first;
    }
    
    public T getSecond() {
        return second;
    }
}

class PairString extends Pair<String> {
    public PairString(String first, String second) {
        super(first, second);
    }
}

public class Questao6 {
    public static void main(String[] args) {
        PairString ps = new PairString("Java", "Generics");
        System.out.println(ps.getFirst());
        System.out.println("Interpretacao: A extensao ocorre sem erros desde que a subclasse defina o tipo concreto (String) exigido pelo parametro generico <T> da superclasse no momento da heranca.");
    }
}