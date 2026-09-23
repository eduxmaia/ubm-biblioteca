package biblioteca;

public class Principal {
    public static void main(String[] args) {
        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro l2 = new Livro("O Cortico", "Aluisio Azevedo");
        l2.setAnoPublicacao(1890);
        l2.setNumeroPaginas(304);
        Usuario u1 = new Usuario("Ana Souza", "2026101",
                "Engenharia de Software", "ana.souza@aluno.ubm.br");
        System.out.println("=== UBM Biblioteca - catalogo inicial ===");
        System.out.println(l1.getTitulo() + " - " + l1.getAutor()
                + " (" + l1.getAnoPublicacao() + ")");
        System.out.println(l2.getTitulo() + " - " + l2.getAutor()
                + " (" + l2.getAnoPublicacao() + ")");
        System.out.println("Leitor: " + u1.getNome()
                + " [" + u1.getMatricula() + "]");
    }
}