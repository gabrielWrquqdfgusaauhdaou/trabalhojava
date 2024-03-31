public class calculadora {
     double num1;
     double num2;

    public calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double somar() {
        return num1 + num2;
    }

    public double subtrair() {
        return num1 - num2;
    }

    public double multiplicar() {
        return num1 * num2;
    }

    public double dividir() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN; // Retornando NaN (Not a Number) para indicar um resultado inválido
        }
    }
}