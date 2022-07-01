import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public String getNome() {
        return nome;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String nomeDaAgencia) {
        Agencia agenciaPesquisada = new Agencia(nomeDaAgencia);
        if(getAgencias().contains(agenciaPesquisada)) {
            return getAgencias().get(getAgencias().indexOf(agenciaPesquisada));
        } else return null;
    }

    public boolean adicionarAgencia(String nomeDaAgencia) {
        Agencia novaAgencia = new Agencia(nomeDaAgencia);
        Agencia agenciaPesquisada = buscarAgencia(novaAgencia.getNome());

        if(agenciaPesquisada != null) return false;

        getAgencias().add(novaAgencia);
        return true;
    }

    public boolean adicionarCliente(String nomeDaAgencia, String nomeDoCliente, double valorInicial) {
        Agencia agenciaPesquisada = buscarAgencia(nomeDaAgencia);
        if(agenciaPesquisada == null) return false;

        boolean resultadoDaAdicao = agenciaPesquisada.novoCliente(nomeDoCliente, valorInicial);
        return resultadoDaAdicao;
    }

    public boolean adicionarTransacaoCliente(String nomeDaAgencia, String nomeDoCliente, double valorTransacao) {
        Agencia agenciaPesquisada = buscarAgencia(nomeDaAgencia);
        if(agenciaPesquisada == null) return false;

        Cliente clientePesquisado = agenciaPesquisada.buscarCliente(nomeDoCliente);
        if(clientePesquisado == null) return false;

        clientePesquisado.adicionarTransacao(valorTransacao);
        return true;
    }

    public boolean listarClientes(String nomeDaAgencia, boolean imprimeTransacoes) {
        Agencia agenciaPesquisada = buscarAgencia(nomeDaAgencia);
        if(agenciaPesquisada == null) return false;

        for(Cliente cliente: agenciaPesquisada.getClientes()) {
            if(imprimeTransacoes == true) {
                System.out.printf("Cliente: %s [%d]\n", cliente.getNome(), agenciaPesquisada.getClientes().indexOf(cliente)+1);
                for(double transacao: cliente.getTransacoes()) {
                    System.out.printf("  [%d] valor %.2f\n", cliente.getTransacoes().indexOf(transacao)+1, transacao);
                }
            } else {
                System.out.printf("Cliente: %s [%d]\n", cliente.getNome(), agenciaPesquisada.getClientes().indexOf(cliente)+1);
            }
        }
        return true;
    }
}
