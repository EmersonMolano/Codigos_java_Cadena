import java.util.Scanner;

public class Four_promedio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        
        //Solicitar primer nuero
        System.out.print("Ingresa el primer número: ");
        double numberOne = scanner.nextDouble();

        //Solicitar primer nuero
        System.out.print("Ingresa el segundo número: ");
        double numberTwo = scanner.nextDouble();

        //Solicitar primer nuero
        System.out.print("Ingresa el tercer número: ");
        double numberThree = scanner.nextDouble();

        //Calcular promedio
        double average = (numberOne + numberTwo + numberThree) / 3;

        //Mostrar el resultado
        System.out.print("El promedio es: " + average);

        scanner.close();

    }
}
