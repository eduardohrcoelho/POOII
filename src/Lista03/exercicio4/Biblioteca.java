package Lista03.exercicio4;

public class Biblioteca {
    private String nomeBib = "Amazon";

    public class Livro{
        private String titulo;
        private String autor;

        public Livro(){}

        public Livro(String titulo, String autor){
            this.titulo = titulo;
            this.autor = autor;
        }

        public void exibirDetalhes(){
            System.out.println("Biblioteca: " + nomeBib + "\nTitulo do livro: " + this.titulo + "\nAutor: " + this.autor);
        }

        
    }
    public static void main(String[] args) {
            Biblioteca bib = new Biblioteca();
            Biblioteca.Livro l1 = bib.new Livro("Askabam", "Mumuzinho");
            l1.exibirDetalhes();
        }
}
