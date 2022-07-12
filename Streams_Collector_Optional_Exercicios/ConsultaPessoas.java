import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoaList) {
        TreeMap<String, TreeSet<Pessoa>> mapaPessoas =new TreeMap<>(Collections.reverseOrder());

        pessoaList.stream().forEach(p -> mapaPessoas.put(p.getCargo(), new TreeSet<>()));
        pessoaList.stream().forEach(p -> mapaPessoas.get(p.getCargo()).add(p));

        return mapaPessoas;
    }
}
