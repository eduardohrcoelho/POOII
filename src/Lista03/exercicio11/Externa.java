package Lista03.exercicio11;

public class Externa {
    public void teste(){
        int n = 2;
        if(n == 2){
            class Local{
                public void print(){
                    System.out.println("oi");
                }
            }
        }
        //Local l = new Local();
    }
}

/*
O erro de compilação ocorre devido às regras de escopo (visibilidade) da linguagem Java. As classes internas locais podem ser declaradas dentro de um método ou de um bloco de código específico. Quando a classe local é definida dentro das chaves { } de um bloco if, o seu tempo de vida e sua visibilidade ficam restritos exclusivamente àquele bloco. Por serem completamente escondidas do resto da aplicação, assim que o bloco if se encerra, a classe deixa de existir para o escopo externo. Portanto, ao tentar instanciá-la na linha de baixo, o compilador não reconhece a classe, gerando o erro de símbolo não encontrado.
*/