package ExercicioFixacao.ENUM.ex2;

public class Calculadora {
    public static double calcular(Operacao op, double ... numeros){
        double resultado = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            resultado = op.executar(resultado, numeros[i]);
        }

        return resultado;
    }

    public static void main(String[] args) {
        double resSoma = calcular(Operacao.SOMA, 10,2,3,4);
        System.out.println(resSoma);
        double resSub = calcular(Operacao.SUBTRACAO, 20,4,5,6,2);
        System.out.println(resSub);

    }
}
