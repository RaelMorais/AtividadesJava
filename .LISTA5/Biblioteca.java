import java.util.ArrayList;

class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

 
    public void cadastrarLivro(String titulo, String autor, String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                System.out.println("Erro: Já existe um livro com este ISBN!");
                return;
            }
        }
        livros.add(new Livro(titulo, autor, isbn));
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void emprestarLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                if (livro.isDisponivel()) {
                    livro.setDisponivel(false);
                    System.out.println("Livro emprestado com sucesso!");
                } else {
                    System.out.println("Erro: O livro já está emprestado!");
                }
                return;
            }
        }
        System.out.println("Erro: Livro com ISBN " + isbn + " não encontrado!");
    }

  
    public void devolverLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                if (!livro.isDisponivel()) {
                    livro.setDisponivel(true);
                    System.out.println("Livro devolvido com sucesso!");
                } else {
                    System.out.println("Erro: O livro não está emprestado!");
                }
                return;
            }
        }
        System.out.println("Erro: Livro com ISBN " + isbn + " não encontrado!");
    }

    public void listarDisponiveis() {
        System.out.println("\nLivros Disponíveis:");
        System.out.println("-------------------");
        boolean encontrou = false;
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                livro.exibirInfo();
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum livro disponível.");
        }
    }

    public void listarEmprestados() {
        System.out.println("\nLivros Emprestados:");
        System.out.println("-------------------");
        boolean encontrou = false;
        for (Livro livro : livros) {
            if (!livro.isDisponivel()) {
                livro.exibirInfo();
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum livro emprestado.");
        }
    }

    
    public void buscarLivro(String termo) {
        System.out.println("\nResultados da busca por \"" + termo + "\":");
        System.out.println("-------------------");
        boolean encontrou = false;
        termo = termo.toLowerCase();
        for (Livro livro : livros) {
            if (livro.getTitulo().toLowerCase().contains(termo) ||
                livro.getAutor().toLowerCase().contains(termo)) {
                livro.exibirInfo();
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum livro encontrado com o termo \"" + termo + "\".");
        }
    }
}