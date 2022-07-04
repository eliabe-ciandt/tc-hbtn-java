package provedores;

public class JadLog implements ProvedorFrete{

    private TipoProvedorFrete tipoProvedorFrete;

    public JadLog() {
        this.tipoProvedorFrete = TipoProvedorFrete.JADLOG;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorDoFrete = valor * ((peso > 2000) ? 0.07 : 0.045);

        Frete freteRetornado = new Frete(valorDoFrete, getTipoProvedorFrete());
        return freteRetornado;
    }
}
