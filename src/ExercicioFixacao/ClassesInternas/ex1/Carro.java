package ExercicioFixacao.ClassesInternas.ex1;

public class Carro {
    private String marca;
    private String modelo;
    private Motor motor;

    public class Motor{
        private double potencia;
        private String tipo;
    }

    public void exibirDados(){

        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Potência: " + this.motor.potencia);
        System.out.println("Tipo: " + this.motor.tipo);

    }

    public Carro(String marca, String modelo, double potencia, String tipo){

        
        this.marca = marca;
        this.modelo = modelo;
        this.motor = this.new Motor();
        this.motor.potencia = potencia;
        this.motor.tipo = tipo;
    }


    public static void main(String[] args) {
        Carro c = new Carro("Volks", "Gol", 122.3, "Flex");
        c.exibirDados();
    }
}
