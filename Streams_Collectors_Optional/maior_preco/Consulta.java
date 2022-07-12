import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

        List<Produto>  listaDoPedido = new ArrayList<>();

        pedido.getProdutos().stream()
                .filter(produto -> produto.getCategoria().toString().equals("LIVRO"))
                .forEach(listaDoPedido::add);

        return listaDoPedido;
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtoList) {
        Produto produto;

        produto = produtoList.stream().max(Comparator.comparing(Produto::getPreco)).get();

        return produto;
    }
}
