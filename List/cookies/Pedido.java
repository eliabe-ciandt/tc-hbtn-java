import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pedido {
    ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas(){
        int totalCaixas = 0;
        for(PedidoCookie pedidoCookie: cookies) {
            totalCaixas += pedidoCookie.getQuantidadeCaixas();
        }
        return totalCaixas;
    }

    public int removerSabor(String sabor){
        int quantidadeRemovida = 0;


        Iterator<PedidoCookie> iterator = cookies.iterator();
        while(iterator.hasNext()) {
            PedidoCookie pedidoCookie = iterator.next();
            if(pedidoCookie.getSabor() == sabor) {
                quantidadeRemovida += pedidoCookie.getQuantidadeCaixas();
                iterator.remove();
            }
        }

        return quantidadeRemovida;
    }
}
