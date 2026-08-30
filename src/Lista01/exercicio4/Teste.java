package Lista01.exercicio4;

public class Teste {
    public static void main(String[] args) {
        Jogador j = new Jogador();

        j.adicionarPontos(TipoDePonto.VITORIA, TipoDePonto.ABATE, TipoDePonto.ITEM_ESPECIAL);
        System.out.println(j.getPontuacaoTotal());

    }
}
