import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] inteiros) {
        Set<Integer> comDuplicados = new HashSet<>();
        TreeSet<Integer> resultado = new TreeSet<>();

        for(int inteiro: inteiros) {
            if(comDuplicados.contains(inteiro)) {
                resultado.add(inteiro);
                comDuplicados.add(inteiro);
            } else {
                comDuplicados.add(inteiro);
            }
        }

        return resultado;
    }

}
