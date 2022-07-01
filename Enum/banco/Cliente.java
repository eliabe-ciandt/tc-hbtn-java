import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes = new ArrayList<>();

    public Cliente(String nome, double transacao) {
        this.nome = nome;
        adicionarTransacao(transacao);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(double valorTransacao) {
        transacoes.add(valorTransacao);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;

        Cliente cliente = (Cliente) o;

        return nome != null ? nome.equals(cliente.nome) : cliente.nome == null;
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }
}
