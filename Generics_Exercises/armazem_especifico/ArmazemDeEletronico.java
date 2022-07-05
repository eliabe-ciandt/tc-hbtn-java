import java.util.Map;
import java.util.TreeMap;

public class ArmazemDeEletronico extends Armazem<Eletronico> {

    private Map<String, Eletronico> itens = new TreeMap<>();

    public ArmazemDeEletronico() {
    }

    public Map<String, Eletronico> getItens() {
        return itens;
    }

    @Override
    public void adicionarAoInventario(String nome, Eletronico valor) {
        super.adicionarAoInventario(nome, valor);
    }

    @Override
    public Eletronico obterDoInventario(String nome) {
        return super.obterDoInventario(nome);
    }
}
