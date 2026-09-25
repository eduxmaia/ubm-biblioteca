package biblioteca;

public class Revista extends ItemAcervo {
    private int edicao;
    private String periodicidade; // "Mensal", "Trimestral", "Semestral"

    public Revista(String titulo, int ano, int edicao, String periodicidade) {
        super(titulo, ano);
        this.edicao = edicao;
        this.periodicidade = periodicidade;
    }

    // calcularPrazoDevolucao() NAO e sobrescrito de proposito:
    // revista usa o prazo padrao da biblioteca (7 dias), herdado.
    @Override
    public void exibirFicha() {
        System.out.println("--- Revista ---");
        super.exibirFicha();
        System.out.println("Edicao : " + edicao);
        System.out.println("Period. : " + periodicidade);
    }

    public int getEdicao() {
        return edicao;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }
}