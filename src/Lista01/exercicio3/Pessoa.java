package Lista01.exercicio3;

public abstract class Pessoa {
    private String nome;
    private int idade;
    protected long id;

    public Pessoa(){}

    public Pessoa(String nome, int idade, long id) throws Exception, InvalidIDException{
        setNome(nome);
        setIdade(idade);
        setID(id);
    }

    public void setNome(String nome) throws Exception{
        if(nome.trim().isEmpty()){
            throw new Exception("O nome não pode ser vazio!");
        }

        this.nome = nome;
    }

    public void setIdade(int idade) throws Exception{
        if(idade < 0){
            throw new Exception("A idade não pode ser negativa!");
        }
        this.idade = idade;
    }


    protected abstract void setID(long id) throws InvalidIDException;

}
