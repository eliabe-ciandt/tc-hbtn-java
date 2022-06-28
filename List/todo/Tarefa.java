public class Tarefa {

    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) throws Exception {
        modificarDescricao(descricao);
        this.identificador = identificador;
        this.estahFeita = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public void modificarDescricao(String descricao) throws Exception {
        if(descricao == null || descricao == "") {
            throw new Exception("Descricao de tarefa invalida");
        } else {
            this.descricao = descricao;
        }
    }
}
