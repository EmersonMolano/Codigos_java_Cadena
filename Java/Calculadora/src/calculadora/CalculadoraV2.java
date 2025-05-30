/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class CalculadoraV2 {    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaracion de variables
        int election;
        double numberOne, numberTwo;
        
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
                    suma(numberOne,numberTwo);
                    break;}
            case 2 :{
                    //Resta
                    resta(numberOne,numberTwo);
                    break;}
            case 3: {
                    //Multiplicacion
                    multiplicacion(numberOne,numberTwo);
                    break;}
            case 4:{ //Divicion
                    divicion(numberOne,numberTwo);
                    return;}
            default: 
                System.out.println("Opcion no valida");  
        }      
    }
    //Suma
    public static void suma(double numberOne,double numberTwo){
        double result = 0;
        result = numberOne + numberTwo;
        System.out.print("La suma es: "+ result);

    }
    //Resta
    public static void resta(double numberOne,double numberTwo){
        double result = 0;
        result = numberOne - numberTwo;
        System.out.print("La resta es: "+ result);

    }
    //Multiplicacion
    public static void multiplicacion(double numberOne,double numberTwo){
        double result = 0;
        result = numberOne * numberTwo;
        System.out.print("La multiplicacion es: "+ result);

    }
    //Divicion
    public static void divicion(double numberOne,double numberTwo){
        Scanner scanner = new Scanner(System.in);
        double result = 0 ;
        //Verificacion de divicion entre cero
        while(numberTwo == 0){
            System.out.print("No es posible dividir por cero, escribe otro numero: ");
            numberTwo = scanner.nextDouble();
        }
        result = numberOne / numberTwo;
        System.out.print("La divicion es: "+ result);

    }
}
