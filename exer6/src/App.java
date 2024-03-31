import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Agenda agenda = new Agenda();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Buscar Contato por Nome");
            System.out.println("3. Listar Contatos");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone do Contato: ");
                    String telefone = scanner.nextLine();
                    Contato novoContato = new Contato(nome, telefone);
                    agenda.adicionarContato(novoContato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do contato que deseja buscar: ");
                    String nomeBusca = scanner.nextLine();
                    Contato contatoEncontrado = agenda.buscarContatoPorNome(nomeBusca);
                    if (contatoEncontrado != null) {
                        System.out.println("Contato encontrado: " + contatoEncontrado.getNome() + " - " + contatoEncontrado.getTelefone());
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    agenda.listarContatos();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}