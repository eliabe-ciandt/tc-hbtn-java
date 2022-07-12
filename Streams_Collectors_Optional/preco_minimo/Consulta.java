import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

        Locale.setDefault(new Locale("pt", "br"));

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

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtoList, double precoMinimo) {
        List<Produto> produtos = new ArrayList<>();

        produtoList.stream().filter(p -> p.getPreco() >= precoMinimo).forEach(produtos::add);

        return produtos;
    }
}
