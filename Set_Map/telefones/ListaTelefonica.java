import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> lista;

    public ListaTelefonica() {
        this.lista = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        if(lista.containsKey(nome)) {
            lista.get(nome).add(telefone);
        } else {
            ArrayList<Telefone> temp = new ArrayList<>();
            temp.add(telefone);
            lista.put(nome, temp);
        }
    }

    public ArrayList<Telefone> buscar(String nome) {
        if(lista.containsKey(nome)) {
            return lista.get(nome);
        } else {
            return null;
        }
    }

}
