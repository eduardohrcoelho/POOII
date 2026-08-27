package Lista03.exercicio6;

public abstract class Empresa {
    private String nome = "Empresa ABC";

    private static double impostoGeral = 0.15;

    public void baterPonto(){
        System.out.println("Ponto registrado.");
    }

    public abstract void pagarSalario();

    public class Funcionario{
        public void testarAcessos() {
            System.out.println("--- FUNCIONÁRIO ---");
            System.out.println("Acessa nome: " + nome);
            System.out.println("Acessa imposto: " + impostoGeral);
            baterPonto();
            pagarSalario();
        }
    }

    public static class Informacoes{
        public void testarAcessos() {
            System.out.println("\n--- INFORMAÇÕES ---");
            System.out.println("Acessa imposto: " + impostoGeral);
        }
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa(){
            @Override
            public void pagarSalario(){
                System.out.println("Pagemento realizado!");
            }
        };

        Empresa.Funcionario f = empresa.new Funcionario();
        f.testarAcessos();
        Empresa.Informacoes i = new Empresa.Informacoes();
        i.testarAcessos();
    }
}
