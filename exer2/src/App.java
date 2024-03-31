import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ColecaoLivros colecao = new ColecaoLivros();

        boolean continuar = true;
        while (continuar) {
            System.out.println("=== Adicionar Livro ===");
            System.out.print("Título do Livro: ");
            String titulo = scanner.nextLine();

            System.out.print("Autor do Livro: ");
            String autor = scanner.nextLine();

            System.out.print("Ano de Publicação: ");
            int anoPublicacao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            Livro novoLivro = new Livro(titulo, autor, anoPublicacao);
            colecao.adicionarLivro(novoLivro);

            System.out.print("Deseja adicionar outro livro? (S/N): ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }

        colecao.exibirColecao();
        scanner.close();
    }
}