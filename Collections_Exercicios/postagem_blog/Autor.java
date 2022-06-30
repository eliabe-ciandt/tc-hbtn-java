public class Autor implements Comparable<Autor>{
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return getNome()+" "+getSobrenome();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Autor)) return false;

        Autor autor = (Autor) o;

        if (nome != null ? !nome.equals(autor.nome) : autor.nome != null) return false;
        return sobrenome != null ? sobrenome.equals(autor.sobrenome) : autor.sobrenome == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (sobrenome != null ? sobrenome.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Autor autor) {
        return this.getSobrenome().compareTo(autor.getSobrenome()) *
                this.getNome().compareTo(autor.getNome());
    }
}
