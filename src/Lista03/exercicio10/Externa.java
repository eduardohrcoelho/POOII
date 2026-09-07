package Lista03.exercicio10;

public class Externa {
    public void imprime(){
        String textoLocal = "Texto do método"; 

        class Local {
            public void imprimeTexto(){
                System.out.println(textoLocal); 
            }
        }

        textoLocal = "oi"; 
    }
}

/*
O erro ocorre por causa de uma regra fundamental do Java para as classes internas locais que está no seu material de estudo: elas só podem acessar variáveis locais do método se elas forem declaradas com final (ou seja, constantes que não mudam de valor).

*/