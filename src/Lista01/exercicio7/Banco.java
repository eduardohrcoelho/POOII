package Lista01.exercicio7;

public class Banco {
    private Conta[] contas;

    public Banco(Conta[] contas) {
        this.contas = contas;
    }

    private Conta buscarConta(int numero) {
        for (Conta c : contas) {
            if (c != null && c.getNumeroConta() == numero) {
                return c;
            }
        }
        return null;
    }

    public void transferencia(int contaDe, int contaPara, double valor) throws CNEException, SIException {
        Conta origem = buscarConta(contaDe);
        Conta destino = buscarConta(contaPara);

        if (origem == null) {
            throw new CNEException("Conta de origem não existe!");
        }
        if (destino == null) {
            throw new CNEException("Conta de destino não existe!");
        }

        origem.debita(valor);
        destino.credita(valor);
    }

    public void balanco() {
        double totalDepositos = 0;
        double totalLimiteUtilizado = 0;

        for (Conta c : contas) {
            if (c != null) {
                if (c.getSaldo() >= 0) {
                    totalDepositos += c.getSaldo();
                } else {
                    totalLimiteUtilizado += Math.abs(c.getSaldo());
                }
            }
        }

        System.out.println("--- Balanço Geral do Banco ---");
        System.out.println("Total em contas (positivo): R$ " + totalDepositos);
        System.out.println("Total de limite utilizado: R$ " + totalLimiteUtilizado);
        System.out.println("------------------------------\n");
    }
}
