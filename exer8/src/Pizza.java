import java.util.ArrayList;
import java.util.List;

public class Pizza {
     String nome;
     double valor;
     String[] ingredientes;

    private static List<Pizza> menuPizzas = new ArrayList<>();

    public Pizza(String nome, double valor, String[] ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public static void inicializarMenuPizzas() {
        Pizza margherita = new Pizza("Margherita", 30.0, new String[]{"Molho de tomate", "Mussarela", "Manjericão"});
        Pizza calabresa = new Pizza("Calabresa", 35.0, new String[]{"Molho de tomate", "Mussarela", "Calabresa"});
        Pizza frangoCatupiry = new Pizza("Frango com Catupiry", 40.0, new String[]{"Molho de tomate", "Mussarela", "Frango", "Catupiry"});

        menuPizzas.add(margherita);
        menuPizzas.add(calabresa);
        menuPizzas.add(frangoCatupiry);
    }

    public static List<Pizza> getMenuPizzas() {
        return menuPizzas;
    }
}