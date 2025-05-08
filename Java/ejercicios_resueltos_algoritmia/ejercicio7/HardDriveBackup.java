import java.util.Scanner;

public class HardDriveBackup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gb, mb;
        int cds;
        // Operación
        System.out.print("Ingrese el número de gigabytes del disco duro: ");
        gb = scanner.nextDouble();
        mb = gb * 1024;
        cds = (int)(mb / 700) + 1;
        // Mostrar resultado
        System.out.println("Se necesitan " + cds + " CDs para el respaldo.");
        scanner.close();
    }
} 