class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.printf("Produto: %s, Preço: R$%.2f%n", nome, preco);
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            preco -= preco * (percentual / 100);
        }
    }

    public void aplicarDesconto2(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            preco -= preco * (percentual / 100);
        }
    }
}
