import java.util.Scanner;

public class Six_numero_mayor{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int numberOne = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int numberTwo = scanner.nextInt();

        if(numberOne > numberTwo){
            System.out.println("El numero mayor es: " + numberOne);
        }else{
            System.out.println("El numero mayor es: " + numberTwo);
        }
        
        scanner.close();
    }
}       
