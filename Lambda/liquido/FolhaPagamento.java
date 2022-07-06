public class FolhaPagamento {

    public static double calcularLiquido(Funcionario funcionario, CalculadorDeSalario calculadorDeSalario) {
       double retorno = calculadorDeSalario.calcular(funcionario.getSalario());
       return retorno;
    }
}
