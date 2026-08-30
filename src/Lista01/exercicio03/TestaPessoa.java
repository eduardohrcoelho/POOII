package Lista01.exercicio03;

public class TestaPessoa {
    public static void main(String[] args){
        try{
            PessoaFisica p1 = new PessoaFisica("Eduardo", 19, 2);
            PessoaFisica p2 = new PessoaFisica("João", 19, -2);
            PessoaJuridica p3 = new PessoaJuridica("Maria", -10, 10);
        } catch (InvalidIDException e) {
            System.out.println("ID invalido" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro nos dados:" + e.getMessage());
        }
    }
}
