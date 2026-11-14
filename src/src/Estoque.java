import java.util.ArrayList;

public class Estoque {

    private ArrayList<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    // Adicionar produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    // Listar produtos
    public void listarProdutos() {

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        System.out.println("\n===== PRODUTOS CADASTRADOS =====");

        for (Produto produto : produtos) {
            produto.exibirDados();
            System.out.println("-------------------------");
        }
    }

    // Buscar produto pelo código
    public Produto buscarProduto(int codigo) {

        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }

        return null;
    }
}
