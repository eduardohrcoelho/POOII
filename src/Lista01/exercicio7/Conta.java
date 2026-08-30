package Lista01.exercicio7;

public class Conta {
    private int numeroConta;
    private double saldo;
    private boolean clienteEspecial;
    private double limite;

    public Conta(int numeroConta, double saldo, boolean clienteEspecial, double limite) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.clienteEspecial = clienteEspecial;
        this.limite = limite;
    }

    public int getNumeroConta() { return numeroConta; }
    public double getSaldo() { return saldo; }

    // O método credita apenas soma o valor
    public void credita(double v) {
        this.saldo += v;
    }

    // O método debita verifica o saldo + limite antes de tirar o dinheiro
    public void debita(double v) throws SIException {
        double saldoDisponivel = this.clienteEspecial ? (this.saldo + this.limite) : this.saldo;

        if (v > saldoDisponivel) {
            throw new SIException("Saldo insuficiente na conta: " + this.numeroConta);
        }

        this.saldo -= v;
    }
}
