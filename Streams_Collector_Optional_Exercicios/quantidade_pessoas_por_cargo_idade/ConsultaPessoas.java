import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoaList) {
        TreeMap<String, TreeSet<Pessoa>> mapaPessoas = pessoaList.stream().collect(Collectors.groupingBy(Pessoa::getCargo,
                () -> new TreeMap<>(Comparator.reverseOrder()), Collectors.toCollection(TreeSet::new)));

        return mapaPessoas;
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas) {
        Map<String, Long> mapaPessoas = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));

        return mapaPessoas;
    }

    public static Map<String, Map<Integer,Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoas) {
        Map<String, Map<Integer,Long>> mapaPessoas = pessoas.stream().collect(Collectors
                .groupingBy(Pessoa::getCargo, Collectors.groupingBy(Pessoa::getIdade, Collectors.counting())));

        return mapaPessoas;
    }
}
