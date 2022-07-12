import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoaList) {
        TreeMap<String, TreeSet<Pessoa>> mapaPessoas = pessoaList.stream().collect(Collectors.groupingBy(Pessoa::getCargo,
                () -> new TreeMap<>(Comparator.reverseOrder()), Collectors.toCollection(TreeSet::new)));

        return mapaPessoas;
    }
}
