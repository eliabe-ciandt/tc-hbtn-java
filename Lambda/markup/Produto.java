import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup;
    public Supplier<Double> precoComMarkup;

    public Consumer<Double> atualizarMarkup;

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkup = 10;
        this.precoComMarkup  = () -> getPreco() * (1 + (getPercentualMarkup() / 100));
        this.atualizarMarkup  = n -> setPercentualMarkup(n);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }

    public void setPercentualMarkup(Double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }

}
