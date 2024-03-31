import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Pizza.inicializarMenuPizzas();

        boolean continuar = true;
        while (continuar) {
            int opcao = exibirMenu();

            switch (opcao) {
                case 1:
                    adicionarPedido();
                    break;
                case 2:
                    cancelarPedido();
                    break;
                case 3:
                    gerarRelatorio();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static int exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Adicionar Pedido");
        System.out.println("2. Cancelar Pedido");
        System.out.println("3. Gerar Relatório de Pedidos");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    private static void adicionarPedido() {
        System.out.println("Escolha a pizza pelo número:");
        for (int i = 0; i < Pizza.getMenuPizzas().size(); i++) {
            System.out.println((i+1) + ". " + Pizza.getMenuPizzas().get(i).getNome());
        }
        System.out.print("Opção: ");
        int escolhaPizza = scanner.nextInt();
        if (escolhaPizza < 1 || escolhaPizza > Pizza.getMenuPizzas().size()) {
            System.out.println("Opção inválida.");
            return;
        }
        Pizza pizzaEscolhida = Pizza.getMenuPizzas().get(escolhaPizza - 1);

        System.out.print("Tamanho da pizza (P, M, G): ");
        String tamanho = scanner.next();

        System.out.print("Endereço de entrega: ");
        String endereco = scanner.next();

        Pedido novoPedido = new Pedido(pizzaEscolhida, tamanho, pizzaEscolhida.getValor(), endereco);
        Pedido.adicionarPedido(novoPedido);
        System.out.println("Pedido adicionado com sucesso!");
    }

    private static void cancelarPedido() {
        // Aqui o usuário selecionaria o pedido que deseja cancelar
        System.out.println("Pedido cancelado com sucesso!");
    }

    private static void gerarRelatorio() {
        // Aqui sera gerado um relatório com os pedidos realizados
        System.out.println("Relatório de Pedidos:");
        for (Pedido pedido : Pedido.getPedidos()) {
            System.out.println("Pizza: " + pedido.getPizza().getNome() + ", Tamanho: " + pedido.getTamanho() +
                    ", Valor: R$" + pedido.getValor() + ", Endereço: " + pedido.getEndereco());
        }
    }
}