import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Jogador> jogadores = new ArrayList<>();
        jogadorcontrole controller = new jogadorcontrole(jogadores);
        int opcao;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Adicionar Jogador");
            System.out.println("2. Aumentar Pontuação");
            System.out.println("3. Subir de Nível");
            System.out.println("4. Mostrar Jogadores Cadastrados");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    controller.adicionarJogador(scanner);
                    break;
                case 2:
                    controller.aumentarPontuacao(scanner);
                    break;
                case 3:
                    controller.subirNivel(scanner);
                    break;
                case 4:
                    controller.mostrarJogadores();
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}