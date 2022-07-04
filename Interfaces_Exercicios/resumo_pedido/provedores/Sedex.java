package provedores;

public class Sedex implements ProvedorFrete{

    private TipoProvedorFrete tipoProvedorFrete;

    public Sedex() {
        this.tipoProvedorFrete = TipoProvedorFrete.SEDEX;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorDoFrete = valor * ((peso > 1000) ? 0.1 : 0.05);

        Frete freteRetornado = new Frete(valorDoFrete, getTipoProvedorFrete());
        return freteRetornado;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return tipoProvedorFrete;
    }
}
