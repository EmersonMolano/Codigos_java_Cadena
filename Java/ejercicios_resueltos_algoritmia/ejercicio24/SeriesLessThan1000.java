public class SeriesLessThan1000 {
    public static void main(String[] args) {
        int s = 1;
        // Operación
        while (s < 1000) {
            System.out.println(s);
            s = (s * s) + 1;
        }
        // Mostrar resultado (ya se muestran en el ciclo)
    }
} 