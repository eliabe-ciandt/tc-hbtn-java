public class Numero {
    public static void dividir(int a, int b) {
        try {
            int c = (int)a / b;
        } catch (ArithmeticException e){
            System.out.println("Nao eh possivel dividir por zero");;
        } finally {
            System.out.printf("%d / %d = %d\n", a, b, ((b !=0) ? (int) a/b : 0));
        }
    }
}
