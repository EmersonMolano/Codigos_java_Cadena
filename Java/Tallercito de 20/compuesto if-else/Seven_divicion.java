import java.util.Scanner;

public class Seven_divicion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double numberOne = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo numero: ");
        double numberTwo = scanner.nextDouble();

        double result = numberOne / numberTwo;

        if(numberTwo == 0){
            System.out.println("No se puede dividir por cero");
        }else{
            System.out.println("El resultado de la divicion es: " + result);
        }

        scanner.close();
    
    }
}
