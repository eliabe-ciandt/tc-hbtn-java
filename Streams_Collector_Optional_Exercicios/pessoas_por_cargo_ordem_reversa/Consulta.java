import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

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

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtoList, double precoMinimo) {
        List<Produto> produtos = new ArrayList<>();

        produtoList.stream().filter(p -> p.getPreco() >= precoMinimo).forEach(produtos::add);

        return produtos;
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidoList) {
        List<Pedido> pedidos = new ArrayList<>();

        pedidoList.stream()
                .filter(p -> p.getProdutos().stream()
                        .anyMatch(produto -> produto.getCategoria().equals(CategoriaProduto.ELETRONICO)))
                .forEach(pedidos::add);

        return pedidos;
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtoList) {

        produtoList.stream()
                .filter(p -> p.getCategoria()
                        .equals(CategoriaProduto.ELETRONICO))
                .forEach(produto -> produto.setPreco(produto.getPreco() * 0.85));

        return produtoList;
    }

}
