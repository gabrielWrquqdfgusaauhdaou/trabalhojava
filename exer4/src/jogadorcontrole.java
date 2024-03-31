import java.util.ArrayList;
import java.util.Scanner;

public class jogadorcontrole {
    private ArrayList<Jogador> jogadores;

    public jogadorcontrole(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void adicionarJogador(Scanner scanner) {
        System.out.print("Digite o nome do jogador: ");
        String nome = scanner.next();

        System.out.print("Digite a pontuação inicial do jogador: ");
        int pontuacaoInicial = scanner.nextInt();

        System.out.print("Digite o nível inicial do jogador: ");
        int nivelInicial = scanner.nextInt();

        Jogador novoJogador = new Jogador(nome, pontuacaoInicial, nivelInicial);
        jogadores.add(novoJogador);

        System.out.println("Jogador adicionado com sucesso!");
    }

    public void aumentarPontuacao(Scanner scanner) {
        if (jogadores.isEmpty()) {
            System.out.println("Não há jogadores cadastrados.");
            return;
        }

        System.out.print("Digite o índice do jogador que deseja aumentar a pontuação: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < jogadores.size()) {
            System.out.print("Digite a quantidade de pontos para aumentar: ");
            int quantidadePontos = scanner.nextInt();
            jogadores.get(indice).aumentarPontuacao(quantidadePontos);
        } else {
            System.out.println("Índice de jogador inválido.");
        }
    }

    public void subirNivel(Scanner scanner) {
        if (jogadores.isEmpty()) {
            System.out.println("Não há jogadores cadastrados.");
            return;
        }

        System.out.print("Digite o índice do jogador que deseja subir de nível: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < jogadores.size()) {
            jogadores.get(indice).subirNivel();
        } else {
            System.out.println("Índice de jogador inválido.");
        }
    }

    public void mostrarJogadores() {
        if (jogadores.isEmpty()) {
            System.out.println("Não há jogadores cadastrados.");
        } else {
            System.out.println("\n=== Jogadores Cadastrados ===");
            for (int i = 0; i < jogadores.size(); i++) {
                System.out.println("Jogador " + (i + 1) + ":");
                jogadores.get(i).exibirInformacoes();
                System.out.println();
            }
        }
    }
}