public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto(
                1,
                "Notebook",
                3500.00,
                10
        );

        produto.exibirDados();

        produto.adicionarEstoque(5);

        System.out.println("\nApós entrada de estoque:");

        produto.exibirDados();

        produto.removerEstoque(3);

        System.out.println("\nApós saída de estoque:");

        produto.exibirDados();
    }
}
