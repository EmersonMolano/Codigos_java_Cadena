import java.util.Scanner;

public class Neven_nombre_largo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloca tu nombre: ");
        String nombre = scanner.nextLine();

        if (nombre.length() > 8) {
            System.out.println("Tu nombre es largo");
        }
        if (nombre.length() <= 8) {
            System.out.println("Tu nombre es corto");
        }

        scanner.close();
    }
}
