package biblioteca;

/**
 * Superclasse ABSTRATA de todo item do acervo (livro, revista, midia, jornal).
 * Nao pode ser instanciada: "item generico" nao existe na biblioteca real.
 * Implementa Emprestavel: todo item do acervo sabe ser emprestado.
 */
public abstract class ItemAcervo implements Emprestavel {
    // static final: constante da CLASSE. Nome em MAIUSCULAS, por convencao.
    public static final int PRAZO_PADRAO = 7;
    // static: pertence a classe, nao ao objeto. Um contador para todos.
    private static int totalItens = 0;
    // Atributos comuns a todo item. Permanecem private mesmo para as
    // subclasses: elas acessam pelos getters (norma do projeto).
    // final: recebe valor no construtor e nunca mais muda. Titulo e identidade.
    private final String titulo;
    private int anoPublicacao;
    private StatusItem status;

    // Construtor minimo: todo item nasce com titulo e disponivel.
    public ItemAcervo(String titulo) {
        this.titulo = titulo;
        this.status = StatusItem.DISPONIVEL;
        totalItens++; // conta na classe, nao no objeto
    }

    // Construtor completo: encadeia o minimo e acrescenta o ano.
    public ItemAcervo(String titulo, int anoPublicacao) {
        this(titulo);
        this.anoPublicacao = anoPublicacao;
    }

    // ----- METODOS ABSTRATOS: assinatura sem corpo, obrigatorios na subclasse
    // -----
    // Redeclarado aqui, sem corpo, para deixar explicito: quem estender
    // ItemAcervo E OBRIGADO a dizer qual e o seu prazo.
    public abstract int calcularPrazoDevolucao();

    // O nome do tipo, usado pela ficha logo abaixo.
    public abstract String getTipo();

    // ----- METODO CONCRETO QUE USA UM METODO ABSTRATO -----
    // A superclasse organiza a ficha; a subclasse fornece so a parte que varia.
    public void exibirFicha() {
        System.out.println("--- " + getTipo() + " ---");
        System.out.println("Titulo : " + titulo);
        System.out.println("Ano : " + anoPublicacao);
        System.out.println("Status : " + status.getDescricao());
    }

    // ----- CONTRATO Emprestavel, implementado uma unica vez para toda a familia
    // -----
    @Override
    public void emprestar(Usuario usuario) {
        if (status != StatusItem.DISPONIVEL) {
            System.out.println(titulo + ": indisponivel (" + status.getDescricao() + ")");
            return;
        }
        status = StatusItem.EMPRESTADO;
        // calcularPrazoDevolucao() e abstrato aqui: quem responde e o objeto real.
        System.out.println(titulo + " emprestado a " + usuario.getNome()
                + " por " + calcularPrazoDevolucao() + " dias");

    }

    @Override
    public void devolver() {
        status = StatusItem.DISPONIVEL;
        System.out.println(titulo + " devolvido");
    }

    @Override
    public boolean estaDisponivel() {
        return status == StatusItem.DISPONIVEL; // enum se compara com ==
    }

    // Sobrescreve o toString() herdado de Object. A partir daqui,
    // System.out.println(item) e "..." + item usam esta representacao.
    @Override
    public String toString() {
        return titulo + " (" + anoPublicacao + ")";
    }

    // Metodo static: chamado pela CLASSE -> ItemAcervo.getTotalItens()
    public static int getTotalItens() {
        return totalItens;
    }

    // Titulo e identidade do item: getter, sem setter.
    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    // Ano pode ser informado depois (caso de l2 em Principal): setter mantido.
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public StatusItem getStatus() {
        return status;
    }
}