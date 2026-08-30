package Lista01.exercicio4;

public class Jogador {
    private int pontuacaoTotal = 0;

    public void adicionarPontos(TipoDePonto... pontosRecebidos){
        for(TipoDePonto p : pontosRecebidos){
            pontuacaoTotal += p.getPontos();
        }
    }

    public int getPontuacaoTotal(){
        return this.pontuacaoTotal;
    }
}
