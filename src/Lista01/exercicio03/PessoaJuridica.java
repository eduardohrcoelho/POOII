package Lista01.exercicio03;

public class PessoaJuridica extends Pessoa{

    public PessoaJuridica(String nome, int idade, long id) throws Exception, InvalidIDException{
        super(nome, idade, id);
    }

    protected void setID(long id) throws InvalidIDException{
        if(id <= 0){
            throw new InvalidIDException("ID inválido!");
        }

        this.id = id;
    }
}
