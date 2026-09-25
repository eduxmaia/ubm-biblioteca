package biblioteca;

public class Livro extends ItemAcervo {
    private String autor; // so o que e exclusivo do livro
    private int numeroPaginas; // titulo e ano vivem em ItemAcervo

    public Livro(String titulo, String autor) {
        super(titulo); // a superclasse constroi primeiro
        this.autor = autor;
    }

    public Livro(String titulo, String autor, int ano) {
        super(titulo, ano);
        this.autor = autor;
    }

    public Livro(String titulo, String autor, int ano, int paginas) {
        this(titulo, autor, ano); // delega ao de cima, que chama super
        this.numeroPaginas = paginas;
    }

    @Override
    public int calcularPrazoDevolucao() {
        return 14; // livro circula por duas semanas
    }

    @Override
    public void exibirFicha() {
        System.out.println("--- Livro ---");
        super.exibirFicha(); // titulo e ano: a superclasse imprime
        System.out.println("Autor : " + autor);
        System.out.println("Paginas : " + numeroPaginas);
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}