import java.util.Scanner;

public class Eight_decuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        if (precio > 100){

            double descuento = precio * 0.9;
            System.out.println("El precio con descuento es: " + descuento);

        }else{

            System.out.println("El precio es: " + precio);
        }
        
        scanner.close();
    }
}
