import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Criar Nova Conta");
            System.out.println("2. Visualizar Contas Salvas");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Criarconta.criarConta(scanner, contas);
                    break;
                case 2:
                    Visualizarconta.visualizarContas(contas);
                    break;
                case 0:
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}