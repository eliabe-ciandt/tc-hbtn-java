import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private final String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor > 0) {
            if (valor > getSaldo()) {
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            } else {
                this.saldo -= valor;
            }
        } else {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
    }

    public double calcularTarifaMensal() {
        double taxaSobreSaldo = getSaldo() * 0.1;
        double taxaFixa = 10;
        return (taxaSobreSaldo < taxaFixa ? taxaSobreSaldo : taxaFixa);
    }

    public double calcularJurosMensal() {
        double jurosMensal = (getTaxaJurosAnual() / 12) / 100;
        return (getSaldo() > 0 ? getSaldo() * jurosMensal : 0);
    }

    public void aplicarAtualizacaoMensal() {
        this.saldo = getSaldo() - calcularTarifaMensal() + calcularJurosMensal();
//        saldo = getSaldo() - calcularTarifaMensal();
//        saldo = getSaldo() + calcularJurosMensal();
    }
}
