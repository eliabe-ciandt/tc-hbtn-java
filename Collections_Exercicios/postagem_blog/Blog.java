import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        for(Post postagem: postagens) {
            if(postagem.getAutor() == post.getAutor()) {
                if(postagem.getTitulo() == post.getTitulo()) {
                    throw new IllegalArgumentException("Postagem jah existente");
                }
            }
        }
        postagens.add(post);
    }

    public TreeSet<Autor> obterTodosAutores() {
        TreeSet<Autor> autores = new TreeSet<>();

        for(Post post: postagens) {
            autores.add(post.getAutor());
        }

        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> quantidadesPorCategoria = new TreeMap<>();

        for(Post post: postagens) {
            if(!quantidadesPorCategoria.containsKey(post.getCategoria())) {
                quantidadesPorCategoria.put(post.getCategoria(), 1);
            } else {
                quantidadesPorCategoria.put(post.getCategoria(), quantidadesPorCategoria.get(post.getCategoria())+1);
            }
        }

        return quantidadesPorCategoria;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postsDoAutor = new TreeSet<>();

        for(Post post: postagens) {
            if(post.getAutor().equals(autor)) {
                postsDoAutor.add(post);
            }
        }

        return postsDoAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postsPorCategoria = new TreeSet<>();

        for(Post post: postagens) {
            if(post.getCategoria() == categoria) {
                postsPorCategoria.add(post);
            }
        }

        return postsPorCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> todosPostsPorCategoria = new TreeMap<>();

        for(Post post: postagens) {
            if(!todosPostsPorCategoria.containsKey(post.getCategoria())) {
                Set<Post> temp = new TreeSet<>();
                temp.add(post);
                todosPostsPorCategoria.put(post.getCategoria(), temp);
            } else {
                todosPostsPorCategoria.get(post.getCategoria()).add(post);
            }
        }

        return todosPostsPorCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> todosPostsPorAutor = new TreeMap<>();

        for(Post post: postagens) {
            if(!todosPostsPorAutor.containsKey(post.getAutor())) {
                Set<Post> temp = new TreeSet<>();
                temp.add(post);
                todosPostsPorAutor.put(post.getAutor(), temp);
            } else {
                todosPostsPorAutor.get(post.getAutor()).add(post);
            }
        }

        return todosPostsPorAutor;
    }
}
