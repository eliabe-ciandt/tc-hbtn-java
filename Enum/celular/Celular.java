import java.util.ArrayList;

public class Celular {
    ArrayList<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<>();
    }

    public int obterPosicaoContato(String nome) {
        for(Contato contato: contatos) {
            if(contato.getNome().equals(nome)) return contatos.indexOf(contato);
        }
        return -1;
    }
    public void adicionarContato(Contato contato) {

        if(obterPosicaoContato(contato.getNome()) != -1) {
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }

        contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato contatoNovo) {
        int posicaoContatoAntigo = obterPosicaoContato(contatoAntigo.getNome());
        if(posicaoContatoAntigo == -1) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }
        int posicaoContatoNovo = obterPosicaoContato(contatoNovo.getNome());
        if(posicaoContatoNovo != -1 && posicaoContatoNovo != posicaoContatoAntigo) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }

            contatos.set(posicaoContatoAntigo, contatoNovo);
    }

    public void removerContato(Contato contato){
        int posicaoContato = obterPosicaoContato(contato.getNome());
        if(posicaoContato == -1) {
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        } else {
            contatos.remove(posicaoContato);
        }
    }

    public void listarContatos() {
        for(Contato contato: contatos) {
            System.out.printf("%s -> %s (%s)\n", contato.getNome(), contato.getNumeroDeTelefone(), contato.getTipo());
        }
    }

}
