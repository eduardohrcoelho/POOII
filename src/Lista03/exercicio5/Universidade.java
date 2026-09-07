package Lista03.exercicio5;

public class Universidade {
    private static String nome = "IFMG";

    public static class Departamento{
        private String nomeDep = "DCOM";
        private int qtdProfessores = 15;

        public void imprimirDados(){
            System.out.println("Departamento: " + nomeDep + "\nQuantidade de professores: " + qtdProfessores + "\nUniversidade: " + nome);
        }
    }

    public static void main(String[] args) {
        Universidade.Departamento dp = new Universidade.Departamento();
        dp.imprimirDados();
    }
}
