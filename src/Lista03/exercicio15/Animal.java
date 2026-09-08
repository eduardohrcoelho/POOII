package Lista03.exercicio15;

public abstract class Animal {
    public abstract void fazerSom();

    public static void main(String[] args) {
        class Cachorro extends Animal{
            @Override 
            public void fazerSom(){
                System.out.println("Auauau");
            }
        }

        class Gato extends Animal{
            @Override 
            public void fazerSom(){
                System.out.println("Miaumiau");
            }
        }

        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.fazerSom();
        gato.fazerSom();
    }
}

/*
Eu escolheria a Classe Anônima se precisasse instanciar a implementação apenas uma vez no código. Eu escolheria a Classe Local se precisasse criar múltiplos objetos dessa mesma implementação dentro do método, aproveitando a reutilização da estrutura.
*/
