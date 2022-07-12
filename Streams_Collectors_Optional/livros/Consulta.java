import java.util.ArrayList;
import java.util.List;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

        List<Produto>  listaDoPedido = new ArrayList<>();

        pedido.getProdutos().stream()
                .filter(produto -> produto.getCategoria().toString().equals("LIVRO"))
                .forEach(listaDoPedido::add);

        return listaDoPedido;
    }
}
