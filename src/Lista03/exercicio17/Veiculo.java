package Lista03.exercicio17;

public class Veiculo {
    
    // A classe Interna
    public class Motor {
        public void acelerar() {
            System.out.println("Vrumm");
        }
    }
}

class Carro extends Veiculo {

    public void usarMotor() {
        Motor m = new Motor(); 
        m.acelerar();
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.usarMotor();
    }
}
