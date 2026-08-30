package Lista01.exercicio5;

public class Calculadora {
    public static double calcular(Operacao op, double... operandos){
        if(operandos.length < 2){
            throw new IllegalArgumentException("É necessário no minimo 2 operando");
        }

        double resultado = operandos[0];

        for(int i = 1; i < operandos.length; i++){
            resultado = op.executar(resultado, operandos[i]);
        }
        return resultado;
    }

}
