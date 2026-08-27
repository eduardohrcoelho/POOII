package Lista03.exercicio1;

public class Carro {
    public class Tanque{
        private int nivel = 100;

        public int getNivel(){
            System.out.println("O nível atual do tanque é: " + this.nivel);
            return this.nivel;
        }
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        Tanque tanque = carro.new Tanque();

        tanque.getNivel();
    }
}
