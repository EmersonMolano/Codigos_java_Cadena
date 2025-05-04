import java.util.Scanner;

public class Teen_User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la contraseña del usuario: ");
        String contraseña = scanner.nextLine();

        if (nombre.equals("Juan") && contraseña.equals("123456")){
        
            System.out.println("Bienvenido " + nombre);
        
        }else if (nombre.equals("Juan") && contraseña.equals("123456")){
            
            System.out.println("Usuario o contraseña incorrectos");
        
        }
        
        scanner.close();
    }
}
