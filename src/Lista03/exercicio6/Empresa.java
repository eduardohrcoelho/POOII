package Lista03.exercicio6;

public abstract class Empresa {
    private static String nomeEmpresa = "ABC Company";
    private double taxaDeImposto = 1000.0;
    private static int qtdFunc = 1000;
    
    public abstract void pagarSalario();

    public void impostoPago(){
        System.out.println("Total de imposto pago pela empresa: " + taxaDeImposto);
    }

    public class Funcionario{
        private int id = 1;
        private String nomeFunc = "João";

        public void dadosFuncionario(){
            System.out.println("Funcionario: " + nomeFunc + "\nID: " + id + "\nEmpresa: " + nomeEmpresa);
        }
    }

    public static class Informacoes{
        public void imprimeInfo(){
            System.out.println("Empresa: " + nomeEmpresa + "\nQuantidade de funcionarios: " + qtdFunc);
        }
    }

    public static void main(String[] args) {
        Empresa e = new Empresa() {
            public void pagarSalario(){
                System.out.println("Salario pago!");
            }
        };

        Empresa.Funcionario func = e.new Funcionario();
        func.dadosFuncionario();

        Empresa.Informacoes info = new Empresa.Informacoes();
        info.imprimeInfo();
    }
}
