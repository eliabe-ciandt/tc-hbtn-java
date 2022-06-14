public class InteiroPositivo {

    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor){
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }

    Boolean ehPrimo() {
        if (this.valor == 1) {
            return false;
        } else {
            for (int i = 2; i < this.valor; i++) {
                if (this.valor % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public InteiroPositivo(int valor) {
        setValor(valor);
    }

    public InteiroPositivo(String valor){
        setValor(Integer.valueOf(valor));
    }

}
