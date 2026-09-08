package Lista03.exercicio12;

public interface Notificacao {
    public void enviar();

    public static void main(String[] args) {
        Notificacao not = new Notificacao(){
            @Override 
            public void enviar(){
                System.out.println("Notificação");
            }
        };

        not.enviar();

    }
}
