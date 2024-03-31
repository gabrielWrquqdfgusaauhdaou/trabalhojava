import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            int opcao = exibirMenu();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    atualizarProduto();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    gerarRelatorio();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

     static int exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Adicionar Produto");
        System.out.println("2. Atualizar Produto");
        System.out.println("3. Remover Produto");
        System.out.println("4. Gerar Relatório de Estoque");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

     static void adicionarProduto() {
        System.out.println("Adicionar Produto:");
        System.out.print("Nome do Produto: ");
        String nome = scanner.nextLine();
        System.out.print("Código do Produto: ");
        int codigo = scanner.nextInt();
        System.out.print("Preço do Produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade em Estoque: ");
        int quantidadeEstoque = scanner.nextInt();

        Produto novoProduto = new Produto(nome, codigo, preco, quantidadeEstoque);
        Produto.adicionarProduto(novoProduto);
        System.out.println("Produto adicionado com sucesso!");
    }

     static void atualizarProduto() {
        System.out.println("Atualizar Produto:");
        System.out.print("Digite o código do produto que deseja atualizar: ");
        int codigo = scanner.nextInt();

        System.out.print("Novo Nome do Produto: ");
        String novoNome = scanner.next();

        System.out.print("Novo Preço do Produto: ");
        double novoPreco = scanner.nextDouble();

        System.out.print("Nova Quantidade em Estoque: ");
        int novaQuantidade = scanner.nextInt();

        Produto novoProduto = new Produto(novoNome, codigo, novoPreco, novaQuantidade);
        Produto.atualizarProduto(codigo, novoProduto);
        System.out.println("Produto atualizado com sucesso!");
    }

     static void removerProduto() {
        System.out.println("Remover Produto:");
        System.out.print("Digite o código do produto que deseja remover: ");
        int codigo = scanner.nextInt();

        Produto.removerProduto(codigo);
        System.out.println("Produto removido com sucesso!");
    }

     static void gerarRelatorio() {
        System.out.println("Relatório de Estoque:");
        System.out.println("Nome\tCódigo\tPreço\tQuantidade\tValor Total");
        for (Produto produto : Produto.getEstoque()) {
            System.out.println(produto.getNome() + "\t" + produto.getCodigo() + "\t" + produto.getPreco() +
                    "\t" + produto.getQuantidadeEstoque() + "\t" + produto.calcularValorTotal());
        }
    }
}