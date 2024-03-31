import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário todas as informações do carro
        System.out.println("Informe as informações do Carro:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada

        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        // Criando uma instância de carro com as informações fornecidas pelo usuário
        Carro carro = new Carro(marca, modelo, ano, placa);

        // Exibindo informações do carro
        System.out.println("\nInformações do Carro:");
        carro.exibirInformacoes();
        System.out.println();

        // Solicitando ao usuário a quantidade para acelerar
        System.out.print("Quantidade para acelerar (km/h): ");
        int acelerar = scanner.nextInt();
        carro.acelerar(acelerar);

        System.out.println("Velocidade após acelerar: " + carro.getVelocidadeAtual() + " km/h");
        System.out.println();

    
        System.out.print("Quantidade para frear (km/h): ");
        int frear = scanner.nextInt();
        carro.frear(frear);

        
        System.out.println("Velocidade após frear: " + carro.getVelocidadeAtual() + " km/h");

        scanner.close();
    }
}