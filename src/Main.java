public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto(
                1,
                "Notebook",
                3500.00,
                10
        );

        System.out.println("=== DADOS INICIAIS ===");
        produto.exibirDados();

        produto.adicionarEstoque(5);

        System.out.println("\n=== APÓS ENTRADA DE ESTOQUE ===");
        produto.exibirDados();

        produto.removerEstoque(3);

        System.out.println("\n=== APÓS SAÍDA DE ESTOQUE ===");
        produto.exibirDados();
    }
}
