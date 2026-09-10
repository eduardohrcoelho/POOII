package ExercicioFixacao.ClassesInternas.ex2;

public class Endereco {
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;
    private String estado;
    private Logradouro logradouro;

    public class Logradouro{
        private TipoDaVia tipo;
        private String nome; 
    }

    public void exibirEndereco(){

    }

    public Endereco(int numero, String complemento, String bairro, String cidade, String cep, String estado, TipoDaVia tipo, String nome){
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
        this.logradouro = new Logradouro();
        this.logradouro.tipo = tipo;
        this.logradouro.nome = nome;
    }

}

