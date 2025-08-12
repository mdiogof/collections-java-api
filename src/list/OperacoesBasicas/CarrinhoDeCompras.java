package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // Desafio resolvido por conta própria
    // Utiliza a classe Item
    private final List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int qtd) {
        carrinho.add(new Item(nome, preco, qtd));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item i : carrinho) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        carrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        double valorItem;

        for (Item i : carrinho) {
            valorItem = i.getQtd() * i.getPreco();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        // Teste dos métodos criados
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Garrafa", 10, 2);
        carrinho.adicionarItem("caneta", 5.50, 3);

        carrinho.exibirItens();
        System.out.println("O valor total desses itens é R$" + carrinho.calcularValorTotal());

        carrinho.removerItem("Garrafa");

        carrinho.exibirItens();
        System.out.println("O valor total desses itens é R$" + carrinho.calcularValorTotal());
    }
}
