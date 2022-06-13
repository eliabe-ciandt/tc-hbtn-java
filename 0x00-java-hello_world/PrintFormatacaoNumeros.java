public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        System.out.printf("Valor: R$ %,.2f\nTaxa: %.2f%\n", valor, taxa);
    }
}
