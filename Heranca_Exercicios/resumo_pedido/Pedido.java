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

    public double calcularTotalBruto() {
        double totalBruto = 0;

        for(ItemPedido item: itens) {
            totalBruto += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }

        return totalBruto;
    }

    public double calcularTotalComDesconto() {
        double totalComDesconto = calcularTotalBruto() * (1 - (getPercentualDesconto() / 100));
        return totalComDesconto;
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");
        for(ItemPedido itemPedido: itens) {
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %,.2f  Quant: %d  Total: %,.2f\n",
                    itemPedido.getProduto().getClass().getSimpleName(), itemPedido.getProduto().getTitulo(),
                    itemPedido.getProduto().obterPrecoLiquido(), itemPedido.getQuantidade(),
                    itemPedido.getQuantidade() * itemPedido.getProduto().obterPrecoLiquido());
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %,.2f\n", calcularTotalBruto() - calcularTotalComDesconto());
        System.out.printf("TOTAL PRODUTOS: %,.2f\n", calcularTotalBruto());
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %,.2f\n", calcularTotalComDesconto());
        System.out.println("----------------------------");

    }
}
