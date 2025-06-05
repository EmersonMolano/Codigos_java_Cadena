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
public class CalculadoraV3 {
        public static double numberOne,numberTwo, result;
        public static Scanner scanner = new Scanner(System.in);
        
        public static void main(String[] args) {
        //Declaracion de variables
        int election = 0;
        
        //Eleccion
        do{
            System.out.println("¿Que deceas hacer?");
            
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Divicion");
            System.out.println("5. Salir");
            
            System.out.print("Escribe el número de la aoperacion que vas a hacer: ");
            election = scanner.nextInt();
                if(election <= 0){
                    while(election <= 0 || election > 5){
                    System.out.print("No se admiten valores fuera del rango admitodo, por favor ingresar otro: ");
                    election = scanner.nextInt();
                    }
                }
        }while(election == 5);
        
        //Operaciones
        switch (election) {
            case 1:{ 
                //Suma
                suma();
                return;}
            case 2 :{
                //Resta
                resta();
                return;}
            case 3 : { 
                //Multiplicacion
                multiplicacion();
                return;}
            case 4:{ 
                //Divicion
                divicion();
                return;}
            default:{ 
                System.out.println("Has salido");}  
        }      
    }
    //Suma
    public static void suma(){
        System.out.println("Has escojido la Suma");
        datos();
        result = numberOne + numberTwo;
        System.out.print("La suma es: "+ result);
        return;
    }
    //Resta
    public static void resta(){
        System.out.println("Has escojido la Resta");
        datos();
        result = numberOne - numberTwo;
        System.out.print("La resta es: "+ result);
        return;
    }
    //Multiplicacion
    public static void multiplicacion(){
        System.out.println("Has escojido la Multiplicacion");
        datos();
        result = numberOne * numberTwo;
        System.out.print("La multiplicacion es: "+ result);
        return;
    }   
    //Divicion
    public static void divicion(){
        System.out.println("Has escojido la Divicion");
        Scanner scanner = new Scanner(System.in);
        datos();
        //Verificacion de divicion entre cero
        while(numberTwo == 0){
            System.out.print("No es posible dividir por cero, escribe otro numero: ");
            numberTwo = scanner.nextDouble();
        }
        result = numberOne / numberTwo;
        System.out.print("La divicion es: "+ result);
        return;
    }
    
    public static void datos(){
        System.out.println("Primer número: ");
        numberOne = scanner.nextDouble();
        
        System.out.println("Segundo número: ");
        numberTwo = scanner.nextDouble();
    
    }
}
