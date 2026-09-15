package ExercicioFixacao.Generics.Parte2.ex1;

public class Questao1 {
    
    public static <T extends Comparable<T>> void selectionSort(T[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j].compareTo(vetor[indiceMinimo]) < 0) {
                    indiceMinimo = j;
                }
            }
            T temp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] numeros = {64, 25, 12, 22, 11};
        selectionSort(numeros);
        
        for (Integer n : numeros) {
            System.out.print(n + " ");
        }
    }
}