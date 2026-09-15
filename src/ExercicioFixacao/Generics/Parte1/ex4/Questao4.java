package ExercicioFixacao.Generics.Parte1.ex4;

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

class Animal implements Comparable<Animal> {
    protected int weight;

    public Animal(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.weight, other.weight);
    }
}

class Dog extends Animal {
    public Dog(int weight) {
        super(weight);
    }
}

public class Questao4 {
    public static void main(String[] args) {
        Pair<Integer> id1 = new Pair<>(5, 10);
        Pair<Integer> id2 = new Pair<>(5, 10);
        System.out.println(id1.compareTo(id2));

        Pair<Animal> comp1 = new Pair<>(new Animal(10), new Dog(5));
        Pair<Animal> comp2 = new Pair<>(new Dog(10), new Dog(8));
        System.out.println(comp1.compareTo(comp2));
    }
}