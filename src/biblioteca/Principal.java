package biblioteca;

public class Principal {
        public static void main(String[] args) {
                // Livros do desafio-02: nada muda aqui (setAnoPublicacao vem por heranca)
                Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
                Livro l2 = new Livro("O Cortico", "Aluisio Azevedo");
                l2.setAnoPublicacao(1890);
                l2.setNumeroPaginas(304);
                Livro l3 = new Livro("Memorias Postumas de Bras Cubas",
                                "Machado de Assis", 1881, 368);
                // Novo tipo de item
                Revista r1 = new Revista("Revista UBM Ciencia", 2026, 12, "Semestral");
                // Usuarios: inalterados
                Usuario u1 = new Usuario("Ana Souza", "2026101",
                                "Engenharia de Software", "ana.souza@aluno.ubm.br");
                Usuario u2 = new Usuario("Bruno Lima", "2026102", "Sistemas de Informacao");
                u2.setEmail("bruno.lima@aluno.ubm.br");
                // POLIMORFISMO: variavel ItemAcervo, objeto de qualquer subclasse
                ItemAcervo[] acervo = { l1, l2, l3, r1 };
                System.out.println("=== UBM Biblioteca - acervo ===");
                for (int i = 0; i < acervo.length; i++) {
                        acervo[i].exibirFicha(); // a ficha do objeto real
                        System.out.println("Prazo : "
                                        + acervo[i].calcularPrazoDevolucao() + " dias");
                }
                System.out.println("=== Usuarios ===");
                u1.exibirFicha();
                u2.exibirFicha();
        }
}