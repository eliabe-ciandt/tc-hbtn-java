import java.util.HashMap;
import java.util.HashSet;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> lista;

    public ListaTelefonica() {
        this.lista = new HashMap<String, HashSet<Telefone>>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone) {
        if(lista.containsKey(nome) && lista.get(nome).contains(telefone)) {
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }
        for(String name: lista.keySet()) {
            if (lista.get(name).contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
            }
        }

        if(lista.containsKey(nome)) {
            lista.get(nome).add(telefone);
        } else {
            HashSet<Telefone> temp = new HashSet<>();
            temp.add(telefone);
            lista.put(nome, temp);
        }

        return lista.get(nome);
    }

    public HashSet<Telefone> buscar(String nome) {
        if(lista.containsKey(nome)) {
            return lista.get(nome);
        } else {
            return null;
        }
    }

}
