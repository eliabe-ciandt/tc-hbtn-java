import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {
    List<Post> postagens = new ArrayList<Post>();

    public Blog() {
        this.postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        postagens.add(post);
    }

    public TreeSet<String> obterTodosAutores() {
        TreeSet<String> autores = new TreeSet<>();

        for(Post post: postagens) {
            autores.add(post.getAutor());
        }

        return autores;
    }

    public TreeMap<String, Integer> obterContagemPorCategoria() {
        TreeMap<String, Integer> quantidadesPorCategoria = new TreeMap<>();

        for(Post post: postagens) {
            if(!quantidadesPorCategoria.containsKey(post.getCategoria())) {
                quantidadesPorCategoria.put(post.getCategoria(), 1);
            } else {
                quantidadesPorCategoria.put(post.getCategoria(), quantidadesPorCategoria.get(post.getCategoria())+1);
            }
        }

        return quantidadesPorCategoria;
    }
}
