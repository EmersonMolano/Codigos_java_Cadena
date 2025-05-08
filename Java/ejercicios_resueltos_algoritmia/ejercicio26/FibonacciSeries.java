public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0;
        // Operación
        System.out.println(a);
        System.out.println(b);
        while (c < 100000) {
            c = a + b;
            if (c < 100000) {
                System.out.println(c);
            }
            a = b;
            b = c;
        }
        // Mostrar resultado (ya se muestran en el ciclo)
    }
} 