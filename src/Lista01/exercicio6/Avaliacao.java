package Lista01.exercicio6;

public enum Avaliacao {
    PROJETO(40),
    TRABALHO(20),
    PROVA_PRATICA(30),
    PROVA_TEORICA(10);

    private int peso;

    Avaliacao(int peso){
        this.peso = peso;
    }

    public static int calcularNota(double... notas) throws IllegalArgumentException{
        if(notas.length != 4){
            throw new IllegalArgumentException("Não tem notas suficiente");
        }

        double somaFinal = 0;
        Avaliacao[] todasAvaliacoes = Avaliacao.values();

        for(int i = 0; i < notas.length; i++){
            if(notas[i] < 0){
                throw new IllegalArgumentException("A nota não pode ser menor igual que zero");
            }

            somaFinal += notas[i] * (todasAvaliacoes[i].peso/100.0);
        }
        return (int) somaFinal;
    }
}
