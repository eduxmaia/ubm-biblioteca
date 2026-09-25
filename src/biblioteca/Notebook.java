package biblioteca;

public class Notebook implements Emprestavel {
    private String patrimonio;
    private String marca;
    private Usuario usuario;
    private boolean emprestado;

    public Notebook(String patrimonio, String marca) {
        this.patrimonio = patrimonio;
        this.marca = marca;
        this.emprestado = false;
    }

    @Override
    public void emprestar(Usuario usuario) {
        if (!emprestado) {
            this.usuario = usuario;
            this.emprestado = true;

            System.out.println("Notebook " + patrimonio
                    + " emprestado a " + usuario.getNome()
                    + " por " + calcularPrazoDevolucao() + " dias");
        } else {
            System.out.println("Notebook " + patrimonio
                    + ": indisponivel");
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            usuario = null;
            System.out.println("Notebook " + patrimonio + " devolvido");
        }
    }

    @Override
    public boolean estaDisponivel() {
        return !emprestado;
    }

    @Override
    public int calcularPrazoDevolucao() {
        return 2;
    }

    @Override
    public String toString() {
        return "Notebook " + marca + " (" + patrimonio + ")";
    }
}