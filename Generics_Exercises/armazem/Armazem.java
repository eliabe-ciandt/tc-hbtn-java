import java.util.Map;
import java.util.TreeMap;

public class Armazem<U> implements Armazenavel<U>{

    private Map<String, U> itens = new TreeMap<>();

    public Armazem() {
    }

    public Map<String, U> getItens() {
        return itens;
    }

    @Override
    public void adicionarAoInventario(String nome, U valor) {
        itens.put(nome, valor);
    }

    @Override
    public U obterDoInventario(String nome) {
        return itens.get(nome);
    }
}
