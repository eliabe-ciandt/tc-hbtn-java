public class NumerosPares {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i+=2) {
            System.out.printf((i < 98) ? (i + ", ") : (i + "\n"));
        }
    }
}
