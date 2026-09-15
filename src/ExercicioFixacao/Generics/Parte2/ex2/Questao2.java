package ExercicioFixacao.Generics.Parte2.ex2;

class InvalidSubscriptException extends RuntimeException {
    public InvalidSubscriptException(String message) {
        super(message);
    }
}

public class Questao2 {

    public static <T> void printArray(T[] vetor, int lowSubscript, int rigthSubscript) {
        if (lowSubscript < 0 || rigthSubscript > vetor.length || lowSubscript >= rigthSubscript) {
            throw new InvalidSubscriptException("Intervalo de indices invalido.");
        }
        
        for (int i = lowSubscript; i < rigthSubscript; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Double[] valores = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        
        printArray(valores, 1, 4);
    }
}