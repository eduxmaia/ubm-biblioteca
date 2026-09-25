package biblioteca;

public class Principal {
        public static void main(String[] args) {
                // Itens do acervo: as mesmas chamadas de construtor do desafio-03.
                Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
                Livro l2 = new Livro("O Cortico", "Aluisio Azevedo");
                l2.setAnoPublicacao(1890);
                l2.setNumeroPaginas(304);
                Livro l3 = new Livro("Memorias Postumas de Bras Cubas",
                                "Machado de Assis", 1881, 368);
                Revista r1 = new Revista("Revista UBM Ciencia", 2026, 12, "Semestral");
                Midia m1 = new Midia("Central do Brasil", 1998, "DVD", 113);
                Jornal j1 = new Jornal("Jornal de Barra Mansa", 2026, "28/08/2026", "Cidades");
                // NOVO: um emprestavel que NAO e item do acervo.
                SalaEstudo s1 = new SalaEstudo("Sala 3 - Bloco B", 6);
                Usuario u1 = new Usuario("Ana Souza", "2026101",
                                "Engenharia de Software", "ana.souza@aluno.ubm.br");
                Usuario u2 = new Usuario("Bruno Lima", "2026102", "Sistemas de Informacao");
                u2.setEmail("bruno.lima@aluno.ubm.br");
                // ItemAcervo continua servindo de TIPO de variavel, mesmo sendo abstrata.
                // O que nao existe mais e new ItemAcervo(...).
                ItemAcervo[] acervo = { l1, l2, l3, r1, m1, j1 };
                System.out.println("=== UBM Biblioteca - acervo ===");
                for (int i = 0; i < acervo.length; i++) {
                        acervo[i].exibirFicha();
                        System.out.println("Prazo : "
                                        + acervo[i].calcularPrazoDevolucao() + " dias");
                }
                // Membro static: pedido a CLASSE, nao a um objeto.
                System.out.println("=== Itens cadastrados: " + ItemAcervo.getTotalItens() + " ===");
                // Metodo default da interface + constante da interface.
                System.out.println("Prazo de livro dentro da politica de "
                                + Emprestavel.PRAZO_MAXIMO_DIAS + " dias? " + l1.dentroDaPolitica());
                // POLIMORFISMO POR INTERFACE: livro, revista, midia, jornal e uma SALA
                // no mesmo vetor. Nenhum parentesco de heranca entre SalaEstudo e o resto.
                Emprestavel[] emprestaveis = { l1, r1, m1, j1, s1 };
                System.out.println("=== Emprestimos ===");
                for (int i = 0; i < emprestaveis.length; i++) {
                        emprestaveis[i].emprestar(u1);
                }
                l1.emprestar(u2); // ja esta emprestado: o status impede
                l1.devolver();
                // instanceof com padrao de tipo: so o item do acervo tem ficha.
                System.out.println("=== Situacao ===");
                for (int i = 0; i < emprestaveis.length; i++) {
                        Emprestavel e = emprestaveis[i];
                        if (e instanceof ItemAcervo item) {
                                System.out.println(item + " | " + item.getStatus().getDescricao());
                        } else {
                                System.out.println(e + " | espaco fisico");
                        }
                }
                System.out.println("=== Usuarios ===");
                u1.exibirFicha();
                u2.exibirFicha();
        }
}