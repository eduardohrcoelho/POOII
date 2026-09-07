package Lista03.exercicio9;

public class Loja {
    private double valorProduto = 100.0;

    public void aplicarDesconto(){
        final double DESCONTO = 10.0;

        class ClasseLocal{
            public double calculaDesconto(double valorProduto){
                valorProduto = Loja.this.valorProduto;
                return valorProduto - DESCONTO;
            }
        }

        ClasseLocal local = new ClasseLocal();
        System.out.println("Total com desconto: " + local.calculaDesconto(Loja.this.valorProduto));
    }


    public static void main(String[] args) {
        Loja l = new Loja();
        l.aplicarDesconto();
    }
}
