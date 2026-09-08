package ExercicioFixacao.ENUM.ex1;

public enum TipoDePonto {
    VITORIA(100), ABATE(20), ITEM_ESPECIAL(5);

    private int ponto;

    private TipoDePonto(int ponto){
        this.ponto = ponto;
    }
    
    public int getPonto(){
        return this.ponto;
    }
}

class Jogador{
    private int pontuacaoTotal = 0;

    public void adicionarPonto(TipoDePonto ... pontos){
        for(TipoDePonto p : pontos){
            this.pontuacaoTotal += p.getPonto();
        }
    }

    public static void main(String[] args) {
        Jogador j1 = new Jogador();

        j1.adicionarPonto(TipoDePonto.VITORIA, TipoDePonto.ABATE, TipoDePonto.ITEM_ESPECIAL);
        j1.adicionarPonto(TipoDePonto.ABATE);
    }
}
