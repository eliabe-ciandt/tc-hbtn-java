import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtoList, CriterioFiltro criterioFiltro) {
        List<Produto> listaFinal = new ArrayList<>();
        produtoList.stream()
                .filter(criterioFiltro::testar)
                .forEach(listaFinal::add);

        return listaFinal;
    }
}
