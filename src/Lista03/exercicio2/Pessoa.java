public class Pessoa{
    private String nome = "João";

    public class Documento{
        public void verNome(){
                System.out.println("Seu nome é: " + nome);
        }
        public static void main(String[] args) {
            Pessoa p = new Pessoa();

            Pessoa.Documento doc = p.new Documento();

            doc.verNome();
        }
    }
}