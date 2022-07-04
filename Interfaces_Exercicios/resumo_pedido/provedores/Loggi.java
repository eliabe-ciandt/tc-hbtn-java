package provedores;

public class Loggi implements ProvedorFrete{

    private TipoProvedorFrete tipoProvedorFrete;

    public Loggi() {
        this.tipoProvedorFrete = TipoProvedorFrete.LOGGI;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }


    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorDoFrete = valor * ((peso > 5000) ? 0.12 : 0.04);

        Frete freteRetornado = new Frete(valorDoFrete, getTipoProvedorFrete());
        return freteRetornado;
    }
}
