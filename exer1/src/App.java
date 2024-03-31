import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        calculadora calc = new calculadora(num1, num2);

        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0.0;

        switch (operacao) {
            case '+':
                resultado = calc.somar();
                break;
            case '-':
                resultado = calc.subtrair();
                break;
            case '*':
                resultado = calc.multiplicar();
                break;
            case '/':
                resultado = calc.dividir();
                break;
            default:
                System.out.println("Operação inválida!");
        }

        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}