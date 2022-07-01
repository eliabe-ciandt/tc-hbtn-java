public class Contato {
    private String nome;
    private String numeroDeTelefone;
    private TipoNumero tipo;

    public Contato(String nome, String numeroDeTelefone, TipoNumero tipo) {
        this.nome = nome;
        this.numeroDeTelefone = numeroDeTelefone;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public TipoNumero getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;

        Contato contato = (Contato) o;

        if (nome != null ? !nome.equals(contato.nome) : contato.nome != null) return false;
        if (numeroDeTelefone != null ? !numeroDeTelefone.equals(contato.numeroDeTelefone) : contato.numeroDeTelefone != null)
            return false;
        return tipo == contato.tipo;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (numeroDeTelefone != null ? numeroDeTelefone.hashCode() : 0);
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        return result;
    }
}
