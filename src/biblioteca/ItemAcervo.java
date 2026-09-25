package biblioteca;

public class ItemAcervo {
    private String titulo; // comum a todo item
    private int anoPublicacao; // comum a todo item

    public ItemAcervo(String titulo) {
        this.titulo = titulo;
    }

    public ItemAcervo(String titulo, int anoPublicacao) {
        this(titulo); // encadeia o construtor acima
        this.anoPublicacao = anoPublicacao;
    }

    public int calcularPrazoDevolucao() {
        return 7; // prazo padrao da biblioteca, em dias
    }

    public void exibirFicha() {
        System.out.println("Titulo : " + titulo);
        System.out.println("Ano : " + anoPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}