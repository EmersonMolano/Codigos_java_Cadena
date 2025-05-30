/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author SENA
 */
import java.util.Scanner;
public class CalculadoraV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaracion de variables
        int election;
        double numberOne, numberTwo, result;
        
        //Eleccion
        System.out.println("¿Que deceas hacer?");
        
        System.out.println("1. Suma");
        
        System.out.println("2. Resta");
        
        System.out.println("3. Multiplicacion");
        
        System.out.println("4. Divicion");
        
        System.out.print("Escribe el número de la aoperacion que vas a hacer: ");
        election = scanner.nextInt();
        
        //Asicnacion de datos
        System.out.println("Primer número: ");
        numberOne = scanner.nextDouble();
        
        System.out.println("Segundo número: ");
        numberTwo = scanner.nextDouble();
        
        //Operaciones
        switch (election) {
            case 1:{
                //Suma
                result = numberOne + numberTwo;
                System.out.print("La suma es: " + result);
                break;}
            case 2:{
                //Resta
                result = numberOne - numberTwo;
                System.out.print("La resta es: "+ result);
                break;}
            case 3:{
                //Multiplicacion
                result = numberOne * numberTwo;
                System.out.print("La multiplicacion es: "+ result) ;
                break;}
            case 4:{
                //Divicion
                while(numberTwo == 0){
                System.out.print("No es posible dividir por cero, escribe otro numero: ");
                numberTwo = scanner.nextDouble();
                }
                result = numberOne / numberTwo;
                System.out.print("La divicion es: " + result);
                break;}

            default:{
                System.out.println("Opcion no valida");
                break;}
        }
        
        scanner.close();
    }
    
}
