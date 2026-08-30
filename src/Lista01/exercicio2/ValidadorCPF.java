package Lista01.exercicio2;

public class ValidadorCPF {
    public static void validarCPF(String cpf) throws Exception {

        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            throw new Exception("CPF inválido devido ao formato ou tamanho incorreto.");
        }

        try {
            int soma1 = 0;
            int peso1 = 10;

            for (int i = 0; i < 9; i++) {
                int num = Integer.parseInt(cpf.substring(i, i + 1));
                soma1 += (num * peso1);
                peso1--;
            }

            int resto1 = soma1 % 11;
            int digito1 = (resto1 == 0 || resto1 == 1) ? 0 : (11 - resto1);

            int soma2 = 0;
            int peso2 = 11;

            for (int i = 0; i < 10; i++) {
                int num = Integer.parseInt(cpf.substring(i, i + 1));
                soma2 += (num * peso2);
                peso2--;
            }

            int resto2 = soma2 % 11;
            int digito2 = (resto2 == 0 || resto2 == 1) ? 0 : (11 - resto2);

            String digitosCalculados = String.valueOf(digito1) + String.valueOf(digito2);
            String digitosInformados = cpf.substring(9, 11);

            if (!digitosCalculados.equals(digitosInformados)) {
                throw new Exception("CPF inválido devido ao erro nos dígitos verificadores.");
            }

            System.out.println("CPF validado!");

        } catch (NumberFormatException e) {
            throw new Exception("CPF inválido devido a presença de caracteres inválidos.");
        }
    }

    public static void main(String[] args) {
        String cpfTeste = "123.456.789-09";

        try {
            System.out.println("Testando o CPF: " + cpfTeste);
            validarCPF(cpfTeste);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
