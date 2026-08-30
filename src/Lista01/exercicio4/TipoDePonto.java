package Lista01.exercicio4;

public enum TipoDePonto {
    VITORIA(100),
    ABATE(20),
    ITEM_ESPECIAL(5);

    private int pontos;

    TipoDePonto(int pontos){
        this.pontos = pontos;
    }

    public int getPontos(){
        return this.pontos;
    }
}
