import java.util.ArrayList;
import java.util.List;

public class Produto {
     String nome;
     int codigo;
     double preco;
     int quantidadeEstoque;

     static List<Produto> estoque = new ArrayList<>();

     Produto(String nome, int codigo, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

     String getNome() {
        return nome;
    }

     void setNome(String nome) {
        this.nome = nome;
    }

     int getCodigo() {
        return codigo;
    }

     void setCodigo(int codigo) {
        this.codigo = codigo;
    }

     double getPreco() {
        return preco;
    }

     void setPreco(double preco) {
        this.preco = preco;
    }

     int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

     void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

     static void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }

     static void removerProduto(int codigo) {
        estoque.removeIf(produto -> produto.getCodigo() == codigo);
    }

     static void atualizarProduto(int codigo, Produto novoProduto) {
        for (int i = 0; i < estoque.size(); i++) {
            if (estoque.get(i).getCodigo() == codigo) {
                estoque.set(i, novoProduto);
                break;
            }
        }
    }

     static List<Produto> getEstoque() {
        return estoque;
    }

     double calcularValorTotal() {
        return preco * quantidadeEstoque;
    }
}