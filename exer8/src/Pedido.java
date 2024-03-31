import java.util.ArrayList;
import java.util.List;

public class Pedido {
     Pizza pizza;
     String tamanho;
     double valor;
     String endereco;

     static List<Pedido> pedidos = new ArrayList<>();

    public Pedido(Pizza pizza, String tamanho, double valor, String endereco) {
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.valor = valor;
        this.endereco = endereco;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getTamanho() {
        return tamanho;
    }

    public double getValor() {
        return valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public static void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public static void cancelarPedido(int indice) {
        pedidos.remove(indice);
    }

    public static List<Pedido> getPedidos() {
        return pedidos;
    }
}