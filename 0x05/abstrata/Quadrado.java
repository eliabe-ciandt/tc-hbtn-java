public class Quadrado extends Retangulo{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if(lado < 0) {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        } else {
            this.lado = lado;
        }
    }

    @Override
    public double area() {
        return getLado() * getLado();
    }

    @Override
    public String toString() {
        String retorno = String.format("[Quadrado] %.2f", getLado());
        return retorno;
    }
}
