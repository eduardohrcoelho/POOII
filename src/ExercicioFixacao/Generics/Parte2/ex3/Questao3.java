package ExercicioFixacao.Generics.Parte2.ex3;

class InvalidSubscriptException extends RuntimeException {
    public InvalidSubscriptException(String message) {
        super(message);
    }
}

public class Questao3 {

    public static <T> void printArray(T[] vetor, int lowSubscript, int rigthSubscript) {
        if (lowSubscript < 0 || rigthSubscript > vetor.length || lowSubscript >= rigthSubscript) {
            throw new InvalidSubscriptException("Intervalo de indices invalido.");
        }
        
        for (int i = lowSubscript; i < rigthSubscript; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] vetor, int lowSubscript, int rigthSubscript) {
        if (lowSubscript < 0 || rigthSubscript > vetor.length || lowSubscript >= rigthSubscript) {
            throw new InvalidSubscriptException("Intervalo de indices invalido.");
        }
        
        for (int i = lowSubscript; i < rigthSubscript; i++) {
            System.out.print(vetor[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] palavras = {"Java", "Generics", "Sobrecarga", "Metodos", "Excecoes"};
        
        printArray(palavras, 0, 3);
        
        System.out.println("Quando e possivel usar: A versao sobrecarregada e chamada automaticamente pelo compilador sempre que o argumento passado for explicitamente um array do tipo String.");
        System.out.println("Qual sua utilidade: Permite especializar o comportamento de um metodo generico para um tipo especifico, aplicando formatacoes, otimizacoes ou logicas exclusivas para aquele tipo sem afetar o funcionamento generico dos demais.");
    }
}