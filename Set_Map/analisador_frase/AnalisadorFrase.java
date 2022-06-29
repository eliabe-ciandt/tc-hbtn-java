import java.util.Map;
import java.util.TreeMap;

public class AnalisadorFrase {
    public static TreeMap<String, Integer> contagemPalavras(String texto) {
        Map<String, Integer> quantidadeDePalavras = new TreeMap<String, Integer>();

        texto = texto.replace("?", "").replace(".", "").replace("!", "");
        String[] arrayTexto = texto.toLowerCase().split(" ");

        for(String textoAnalisado: arrayTexto) {
            if(!quantidadeDePalavras.containsKey(textoAnalisado)) {
                quantidadeDePalavras.put(textoAnalisado, 1);
            } else {
                quantidadeDePalavras.put(textoAnalisado, quantidadeDePalavras.get(textoAnalisado) +1);
            }
        }

        return (TreeMap<String, Integer>) quantidadeDePalavras;
    }
}
