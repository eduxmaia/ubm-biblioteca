package biblioteca;

/**
 * Situacao possivel de qualquer coisa que a biblioteca empresta.
 * Conjunto FECHADO de valores: o compilador so aceita estes quatro.
 */
public enum StatusItem {
    // As constantes vem primeiro e chamam o construtor do proprio enum.
    DISPONIVEL("Disponivel"),
    EMPRESTADO("Emprestado"),
    RESERVADO("Reservado"),
    EM_MANUTENCAO("Em manutencao");

    // final: a descricao e definida quando a constante nasce e nunca muda.
    private final String descricao;

    // Construtor de enum e sempre privado: ninguem cria um StatusItem novo.
    StatusItem(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}