class Carrinho {
    private java.util.ArrayList<Item> itens;

    public Carrinho() {
        itens = new java.util.ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int qtd) {
        itens.add(new Item(produto, qtd));
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void mostrarResumo() {
        System.out.println("\nResumo do Carrinho:");
        System.out.println("-------------------");
        for (Item item : itens) {
            System.out.printf("Produto: %s, Preço: R$%.2f, Quantidade: %d, Subtotal: R$%.2f%n",
                    item.getProduto().getNome(),
                    item.getProduto().getPreco(),
                    item.getQuantidade(),
                    item.getSubtotal());
        }
        System.out.printf("Total: R$%.2f%n", calcularTotal());
    }

    //Desafio 07
    public boolean removerProduto(String nome) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getProduto().getNome().equalsIgnoreCase(nome)) {
                itens.remove(i);
                return true; 
            }
        }
        return false; 
    }
}

