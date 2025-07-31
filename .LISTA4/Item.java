class Item{
    private Produto produto;
    private int qtd;

    public Item(Produto produto, int qtd) {
        this.produto = produto;
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return qtd;
    }

    public double getSubtotal() {
        return produto.getPreco() * qtd;
    }
}
