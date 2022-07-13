import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<T> extends ArrayList<Estudante>{
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        try {
            FileOutputStream file = new FileOutputStream
                    (getNomeArquivo());
            ObjectOutputStream out = new ObjectOutputStream
                    (file);

            out.writeObject(estudantes);

            out.close();
            file.close();
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar() {
        List<Estudante> estudantes = null;
        try {
            FileInputStream file = new FileInputStream(getNomeArquivo());
            ObjectInputStream in = new ObjectInputStream(file);

            estudantes = (List<Estudante>) in.readObject();

            in.close();
            file.close();
            return estudantes;

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Nao foi possivel desserializar");
        }

        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SerializarEstudantes)) return false;

        SerializarEstudantes<?> that = (SerializarEstudantes<?>) o;

        return getNomeArquivo() != null ? getNomeArquivo().equals(that.getNomeArquivo()) : that.getNomeArquivo() == null;
    }

    @Override
    public int hashCode() {
        return getNomeArquivo() != null ? getNomeArquivo().hashCode() : 0;
    }
}
