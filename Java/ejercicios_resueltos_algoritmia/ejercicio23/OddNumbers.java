public class OddNumbers {
    public static void main(String[] args) {
        int k = 1, count = 0;
        // Operación
        while (count < 10) {
            if (k % 2 != 0) {
                System.out.println(k);
                count++;
            }
            k++;
        }
        // Mostrar resultado (ya se muestran en el ciclo)
    }
} 