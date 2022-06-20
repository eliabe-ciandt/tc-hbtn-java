import comida.Comida;
import humor.*;

public class Personagem {
    private int pontosDeFelicidade;

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }

    public void setPontosDeFelicidade(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }

    public Humor obterHumorAtual(){
        if (getPontosDeFelicidade() < -5) {
            return new Irritado();
        } else if (getPontosDeFelicidade() < 1) {
            return new Triste();
        } else if (getPontosDeFelicidade() < 16) {
            return new Feliz();
        } else {
            return new MuitoFeliz();
        }
    }

    public void comer(Comida[] comidas){
        for(Comida comida: comidas){
            setPontosDeFelicidade(getPontosDeFelicidade() + comida.getPontosDeFelicidade());
        }
    }

    @Override
    public String toString() {
        return pontosDeFelicidade + " - " + obterHumorAtual().getClass().getSimpleName();
    }
}
