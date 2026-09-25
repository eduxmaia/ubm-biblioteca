package biblioteca;

public class Midia extends ItemAcervo {
    private String formato;
    private int duracao;

    public Midia(String titulo, int ano, String formato) {
        super(titulo, ano);
        this.formato = formato;
    }

    public Midia(String titulo, int ano, String formato, int duracao) {
        super(titulo, ano);
        this.formato = formato;
        this.duracao = duracao;
    }

    @Override
    public int calcularPrazoDevolucao() {
        return 3;
    }

    @Override
    public void exibirFicha() {
        System.out.println("--- Midia ---");
        super.exibirFicha();
        System.out.println("Formato : " + getFormato());
        System.out.println("Duracao : " + getDuracao() + " min");
    }

    public String getFormato() {
        return formato;
    }

    public int getDuracao() {
        return duracao;
    }
}