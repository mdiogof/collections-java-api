package list.OperacoesBasicas;

public class Item {
    // Classe usada pelo CarrinhoDeCompras
    private final String nome;
    private final double preco;
    private final int qtd;

    public Item(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Item{");
        sb.append("nome=").append(nome);
        sb.append(", preco=").append(preco);
        sb.append(", qtd=").append(qtd);
        sb.append('}');
        return sb.toString();
    }
}
