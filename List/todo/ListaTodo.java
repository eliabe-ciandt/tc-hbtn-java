import java.util.ArrayList;

public class ListaTodo {
    ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws Exception {
        for(Tarefa tarefa1: tarefas) {
            if(tarefa1.getIdentificador() == tarefa.getIdentificador()) {
                    throw new Exception("Tarefa com o identificador " + tarefa.getIdentificador() + " ja existente na lista");
            }
        }
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        for(Tarefa tarefa:tarefas){
            if(tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador) {
        for(Tarefa tarefa: tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        for (Tarefa tarefa: tarefas) {
            tarefa.setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for (Tarefa tarefa: tarefas) {
            tarefa.setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        String descricao = "";
        for(Tarefa tarefa: tarefas) {
            System.out.printf("[%s]  Id: %d - Descricao: %s\n", (tarefa.isEstahFeita() ? "X":" "), tarefa.getIdentificador(), tarefa.getDescricao());
        }
    }

}
