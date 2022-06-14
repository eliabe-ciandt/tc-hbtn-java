public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        setSaudeAtual(saudeAtual);
        this.nome = nome;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if(getSaudeAtual() > 0) {
            this.status = "vivo";
        }else {
            this.status = "morto";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome != "") {
            this.nome = nome;
        }
    }

    public String getStatus() {
        return status;
    }

    public void tomarDano(int quantidadeDeDano) {
        setSaudeAtual(getSaudeAtual() - quantidadeDeDano);
        if (getSaudeAtual() < 0){
            setSaudeAtual(0);
        }
    }

    public void receberCura(int quantidadeDeCura) {
        setSaudeAtual(getSaudeAtual() + quantidadeDeCura);
        if (getSaudeAtual() > 100) {
            setSaudeAtual(100);
        }
    }
}
