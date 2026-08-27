package Lista03.exercicio8;

public class Calculadora {

    public double calcular(String nomeOperacao, double operando1, double operando2) {

        interface Operacao {
            double executar();
        }

        class Soma implements Operacao {
            @Override
            public double executar() {
                return operando1 + operando2;
            }
        }

        class Subtracao implements Operacao {
            @Override
            public double executar() {
                return operando1 - operando2;
            }
        }

        class Divisao implements Operacao {
            @Override
            public double executar() {
                return operando1 / operando2;
            }
        }

        class Multiplicacao implements Operacao {
            @Override
            public double executar() {
                return operando1 * operando2;
            }
        }
        Operacao opSelecionada;

        switch (nomeOperacao.toLowerCase()) {
            case "soma":
                opSelecionada = new Soma();
                break;
            case "subtracao":
                opSelecionada = new Subtracao();
                break;
            case "divisao":
                opSelecionada = new Divisao();
                break;
            case "multiplicacao":
                opSelecionada = new Multiplicacao();
            default:
                System.out.println("Operação inválida!");
                return 0.0;
        }

        return opSelecionada.executar();
    }
}
