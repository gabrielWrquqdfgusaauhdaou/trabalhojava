import java.util.ArrayList;

public class ColecaoLivros {
    private ArrayList<Livro> livros;

    public ColecaoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void exibirColecao() {
        System.out.println("\nInformações da Coleção:");
        for (Livro livro : livros) {
            livro.exibirInfo();
            System.out.println();
        }
    }
}