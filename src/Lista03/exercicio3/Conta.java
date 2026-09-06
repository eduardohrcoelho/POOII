package Lista03.exercicio3;

public class Conta {
    private int numero = 2;
    
    public class Operacao{
        private int numero = 1;

        public void mostraNumeros(){
            System.out.println(this.numero + " " + Conta.this.numero);
        }

        public static void main(String[] args) {
            Conta c = new Conta();
            Conta.Operacao op = c.new Operacao();
            op.mostraNumeros();
        }
    }
}
