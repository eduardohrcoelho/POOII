package Lista01.exercicio1;

public class divisaoPorZeroMod {
    public int realizarDivisao(int n1, int n2){
        return n1/n2;
    }

    public static void main(String[] args) {
        divisaoPorZeroMod div = new divisaoPorZeroMod();

        try{
            int result = div.realizarDivisao(4,0);
            System.out.println("Resultado: " + result);
        }catch (ArithmeticException e){
            System.out.println("Erro. Não é possível realizar divisão por zero!");
        }
    }

}
