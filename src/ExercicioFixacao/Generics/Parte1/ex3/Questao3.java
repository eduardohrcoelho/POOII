package ExercicioFixacao.Generics.Parte1.ex3;

class Pair<T extends Comparable<T>> implements Comparable<Pair<T>> {
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

    @Override
    public int compareTo(Pair<T> other) {
        int cmp = this.first.compareTo(other.getFirst());
        if (cmp != 0) {
            return cmp;
        }
        return this.second.compareTo(other.getSecond());
    }
}

public class Questao3 {
    public static void main(String[] args) {
        Pair<Integer> p1 = new Pair<>(10, 50);
        Pair<Integer> p2 = new Pair<>(20, 30);
        
        System.out.println(p1.compareTo(p2));
    }
}