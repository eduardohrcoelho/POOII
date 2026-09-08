package Lista03.exercicio14;

public abstract class Animal {
    public abstract void fazerSom();

    public static void main(String[] args) {
        Animal cachorro = new Animal(){
            @Override 
            public void fazerSom(){
                System.out.println("Auauaua");
            }
        };

        Animal gato = new Animal(){
            @Override 
            public void fazerSom(){
                System.out.println("Miau miau");
            }
        };

        cachorro.fazerSom();
        gato.fazerSom();
    }
}
