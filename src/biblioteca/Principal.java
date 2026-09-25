package biblioteca;

public class Principal {
    public static void main(String[] args) {
        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 1899, 256);
        Livro l2 = new Livro("O Cortico", "Aluisio Azevedo", 1890, 304);
        Livro l3 = new Livro("Capitaes da Areia", "Jorge Amado", 1937, 272);
        Usuario u1 = new Usuario("Ana Souza", "2026101",
                "Engenharia de Software", "ana.souza@aluno.ubm.br");
        Usuario u2 = new Usuario("Bruno Lima", "2026102",
                "Sistemas de Informacao", "bruno.lima@aluno.ubm.br");

        System.out.println("=== LIVROS ===");
        l1.exibirFicha();
        l2.exibirFicha();
        l3.exibirFicha();

        System.out.println("=== USUARIOS ===");
        u1.exibirFicha();
        u2.exibirFicha();
    }
}