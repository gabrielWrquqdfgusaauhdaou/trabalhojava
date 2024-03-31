import java.util.ArrayList;
import java.util.Scanner;

public class Criarconta {
    public static void criarConta(Scanner scanner, ArrayList<ContaBancaria> contas) {
        System.out.println("Criando uma nova conta bancária:");

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer do scanner
        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();
        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria novaConta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);
        contas.add(novaConta);
        System.out.println("Conta bancária criada com sucesso!");
    }
}