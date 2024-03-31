import java.util.ArrayList;

public class Visualizarconta {
    public static void visualizarContas(ArrayList<ContaBancaria> contas) {
        if (contas.isEmpty()) {
            System.out.println("Não há contas bancárias cadastradas.");
            return;
        }

        System.out.println("\n=== Contas Bancárias ===");
        for (ContaBancaria conta : contas) {
            System.out.println("Número da Conta: " + conta.getNumeroConta());
            System.out.println("Nome do Titular: " + conta.getNomeTitular());
            System.out.println("Saldo: R$" + conta.consultarSaldo());
            System.out.println();
        }
    }
}