package Lista03.exercicio16;

public class Cofre {
    private int senha = 1234;
    private double valor = 1000.0;

    public void deposito(double montante){
        this.valor += montante;
        System.out.println("Deposito realizado");
    }

    public class Operador{
        public void efetuaDeposito(double valor){
            Cofre.this.deposito(valor);
        }
    }

    public double getSaldo(){
        return this.valor;
    }

    public static void main(String[] args) {
        Cofre c = new Cofre();
        Cofre.Operador op = c.new Operador();
        op.efetuaDeposito(200);

        System.out.println(c.getSaldo());
    }
}
