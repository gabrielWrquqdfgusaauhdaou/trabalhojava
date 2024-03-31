public class Carro {
     String marca;
     String modelo;
     int ano;
     String placa;
     int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0; 
    }

    // Método para acelerar o carro
    public void acelerar(int quantidade) {
        if (velocidadeAtual + quantidade > 200) {
            velocidadeAtual = 200;
        } else {
            velocidadeAtual += quantidade;
        }
    }

    // Método para frear o carro
    public void frear(int quantidade) {
        if (velocidadeAtual - quantidade < 0) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= quantidade;
        }
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }

    // Método getter para obter a velocidade atual do carro
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}