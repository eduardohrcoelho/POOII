package Lista03.exercicio13;

interface Notificacao{
    public void enviar();
}

public class Teste{
    public void executar(Notificacao notificacao){
        notificacao.enviar();
    }

    public static void main(String[] args) {
        Teste t = new Teste();
        t.executar(new Notificacao() {
            public void enviar(){
                System.out.println("Fifififi");
            }
        });
    }
}
