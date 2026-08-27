package Lista03.exercicio7;

/*
O código não compila porque a classe aninhada Interna é declarada como static, enquanto a variável valor é um atributo de instância
não estático da classe Externa. Membros estáticos pertencem à classe e não possuem referência a um objeto específico. Portanto, um
contexto estático não pode acessar atributos de instância diretamente, já que esses atributos só existem na memória após a instanciação.
 */

public class Externa {
    private static int valor = 10;

    static class Interna{
        void mostrar(){
            System.out.println(valor);
        }
    }
}
