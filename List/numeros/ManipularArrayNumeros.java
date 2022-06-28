import java.util.List;

public class ManipularArrayNumeros {
    public static int buscarPosicaoNumero(List<Integer> lista, int numero) {
        return lista.indexOf(numero);
    }

    public static void adicionarNumero(List<Integer> lista, int numero) throws Exception {
        if (ManipularArrayNumeros.buscarPosicaoNumero(lista, numero) == -1) {
            lista.add(numero);
        } else {
            throw new Exception("Numero jah contido na lista");
        }
    }

    public static void removerNumero(List<Integer> lista, int numero) throws Exception {
        if(ManipularArrayNumeros.buscarPosicaoNumero(lista, numero) == -1) {
            throw new Exception("Numero nao encontrado na lista");
        } else {
            lista.remove(ManipularArrayNumeros.buscarPosicaoNumero(lista, numero));
        }
    }

    public static void substituirNumero(List<Integer> lista, int numeroSubstituir, int numeroSubstituto) {
        if(ManipularArrayNumeros.buscarPosicaoNumero(lista, numeroSubstituir) == -1) {
            lista.add(numeroSubstituto);
        } else {
            lista.set(buscarPosicaoNumero(lista, numeroSubstituir), numeroSubstituto);
        }
    }
}
