import java.util.Scanner;

public class Seven_Calcular_hipotenusa {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Calcular el cateto opuesto
        System.out.print("¿Cual es el cateto opuest?: ");
        double numberOne = scanner.nextDouble();

        //Calcular el cateto adyacente
        System.out.print("¿Cual es el cateto adyacente?: ");
        double numberTwo = scanner.nextDouble();

        //calcular la hipotenusa
        double numberThree = Math.pow(numberOne, 2) + Math.pow(numberTwo, 2);

        System.out.print("La hipotenusa es: " + numberThree);

        scanner.close();
    }
}

