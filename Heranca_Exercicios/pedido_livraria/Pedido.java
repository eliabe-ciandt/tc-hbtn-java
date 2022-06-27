import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public double calcularTotal() {
        double totalBruto = 0;

        for(ItemPedido item: itens) {
            totalBruto += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }

        double totalComDesconto = totalBruto * (1 - (getPercentualDesconto() / 100));
        return totalComDesconto;
    }
}
