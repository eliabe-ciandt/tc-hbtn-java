import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String nomeDoCliente) {
        for(Cliente cliente: clientes) {
            if(cliente.getNome().equals(nomeDoCliente)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean novoCliente(String nomeDoCliente, double valorDaTransacaoInicial) {
        Cliente novoCliente = new Cliente(nomeDoCliente, valorDaTransacaoInicial);
        Cliente testaSeExisteCliente = buscarCliente(novoCliente.getNome());

        if(testaSeExisteCliente != null) {
            return false;
        }

        clientes.add(novoCliente);
        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeDoCliente, double valor){
        Cliente novoCliente = new Cliente(nomeDoCliente, valor);
        Cliente testaSeExisteCliente = buscarCliente(novoCliente.getNome());

        if(testaSeExisteCliente == null) {
            return false;
        }

        int indicaCliente = clientes.indexOf(testaSeExisteCliente);
        clientes.get(indicaCliente).adicionarTransacao(valor);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Agencia)) return false;

        Agencia agencia = (Agencia) o;

        return nome != null ? nome.equals(agencia.nome) : agencia.nome == null;
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }
}
