import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtoList, Predicate<Produto> predicate) {
        List<Produto> listaFinal = new ArrayList<>();
        produtoList.stream()
                .filter(predicate::test)
                .forEach(listaFinal::add);

        return listaFinal;
    }
}
