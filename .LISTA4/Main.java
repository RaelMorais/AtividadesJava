public class Main {
public static void main(String[] args) {
        //cliente
        Cliente cliente = new Cliente("João Silva", "joao.silva@email.com");
        
        //Criar prod
        Produto produto1 = new Produto("Tablet XPro", 2499.99);
        Produto produto2 = new Produto("Smartwatch Fit", 799.90);
        Produto produto3 = new Produto("Câmera Digital 4K", 3599.00);

        //Visualizar Prod
        System.out.println("Informações dos Produtos:");
        produto1.exibirInfo();
        produto2.exibirInfo();
        produto3.exibirInfo();

        //Exibindo dados clientes
        System.out.println("\nDados do Cliente:");
        cliente.mostrarDados();

        //Carrinho
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(produto1, 1);
        carrinho.adicionarProduto(produto2, 2);
        carrinho.adicionarProduto(produto3, 1);

        //Resumo antes do desconto
        System.out.println("\nAntes do desconto:");
        carrinho.mostrarResumo();

        //Desconto
        System.out.println("\nAplicando desconto de 10% no " + produto2.getNome());
        produto2.aplicarDesconto(20);

        //Valor após desconto
        System.out.println("\nApós o desconto:");
        carrinho.mostrarResumo();

        //remoção de um produto
        System.out.println("\nRemovendo o produto 'Smartwatch Fit' do carrinho:");
        boolean removido = carrinho.removerProduto("Smartwatch Fit");
        if (removido) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado no carrinho!");
        }

        // Mostrando resumo após a remoção
        System.out.println("\nApós a remoção:");
        carrinho.mostrarResumo();
    }
}