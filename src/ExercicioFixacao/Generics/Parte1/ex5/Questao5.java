package ExercicioFixacao.Generics.Parte1.ex5;

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

class ArrayAlg<T extends Comparable<T>> {
    
    public Pair<T> getMin(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min.compareTo(array[i]) > 0) {
                min = array[i];
            }
        }
        return new Pair<>(min, min);
    }

    public Pair<T> getMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return new Pair<>(max, max);
    }
}

public class Questao5 {
    public static void main(String[] args) {
        ArrayAlg<Integer> alg = new ArrayAlg<>();
        Integer[] numeros = {15, 2, 8, 99, 1};
        
        Pair<Integer> minPair = alg.getMin(numeros);
        Pair<Integer> maxPair = alg.getMax(numeros);
        
        System.out.println(minPair.getFirst());
        System.out.println(maxPair.getFirst());
    }
}