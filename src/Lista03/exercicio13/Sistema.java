package Lista03.exercicio13;

interface Notificacao{
    void enviar();
}

public class Sistema {
    public void executar(Notificacao notificacao) {
        System.out.println("Preparando o sistema...");

        notificacao.enviar();

        System.out.println("Execução finalizada!\n");
    }

    public static void main(String[] args) {
        Sistema meuSistema = new Sistema();

        meuSistema.executar(new Notificacao() {
            @Override
            public void enviar() {
                System.out.println("Enviando SMS: Seu código de verificação é 1234.");
            }
        });

        meuSistema.executar(new Notificacao() {
            @Override
            public void enviar() {
                System.out.println("Enviando E-mail: Bem-vindo ao nosso sistema!");
            }
        });
    }
}
