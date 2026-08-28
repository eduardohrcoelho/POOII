package Lista01.exercicio1;

public class divisaoPorZeroExcp {

    public void realizarDivisao(int n1, int n2){
        try{
            int result = n1/n2;
            System.out.println("Resultado: " + result);
        }catch (ArithmeticException e){
            System.out.println("Erro: Não é possível dividir por zero.");
        } catch (Exception e) {
            System.out.println("Erro!");;
        }
    }

    public static void main(String[] args) {
        divisaoPorZeroExcp div = new divisaoPorZeroExcp();

        div.realizarDivisao(4,0);
        div.realizarDivisao(4,1);
    }
}
/*
Não é apropriado que o handler do erro seja incluso dentro do
método porque atribui a responsabilidade de tratamento diretamente para o método
e o mais apropriado é que o handler fique onde o método é chamado
 */