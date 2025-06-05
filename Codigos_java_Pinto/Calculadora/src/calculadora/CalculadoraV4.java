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
public class CalculadoraV4 {
    public static double[] numberOne = new double[10],numberTwo = new double[10];
    public static double result, j;
    public static int number;
                
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        //Declaracion de variables
        int election = 0;
        
        System.out.println("Ingresa las 10 parejas de datos que decees usar: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe la  " + (i+1) +(" de las parejas: "));
            System.out.print("1. ");
            numberOne[i] = sc.nextDouble();
            System.out.print("2. ");
            numberTwo[i] = sc.nextDouble();
        }
        //Eleccion
        
        do{
            //Creacion de parejas
            
            System.out.println("¿Cual pareja deceas usar para hacer la operacion?: ");
            for (int x = 0; x < 10; x++) {
                System.out.println((x+1) + ". " + numberOne[x] + ", " + numberTwo[x]);
            }
            number = sc.nextInt();
            
            //Condicion inpedir negativos y superiores
            System.out.print("Escribe el número de la aoperacion que vas a hacer: ");
            if(number <= 0){
                while(number <= 0 || number > 10){
                System.out.print("No existe ese conjunto, por favor ingresar otro: ");
                number = sc.nextInt();
                }
            }
            
            //Eleccion de operacion
            System.out.println("¿Que deceas hacer?");
            
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Divicion");
            System.out.println("5. Salir");
            
            System.out.print("Escribe el número de la aoperacion que vas a hacer: ");
            election = sc.nextInt();
                if(election <= 0){
                    while(election <= 0 || election > 5){
                    System.out.print("No se admiten valores fuera del rango admitodo, por favor ingresar otro: ");
                    election = sc.nextInt();
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
    public static void suma(){
        //llenar();
        result = numberOne[number-1] + numberTwo[number-1];
        System.out.println("La suma es: " + result);
    }
    
    private static void resta() {
       // llenar();
        result = numberOne[number-1] - numberTwo[number-1];
        System.out.println("La resta es: " + result);        
    }

    private static void multiplicacion() {
        //llenar();
        result = numberOne[number-1] * numberTwo[number-1];
        System.out.println("La multiplicacion es: " + result);    
    }

    private static void divicion() {
        //llenar();
        while(numberTwo[number] == 0){
            System.out.print("No es posible dividir por cero, escribe otro numero: ");
            numberTwo[number] = sc.nextDouble();
        }
        result = numberOne[number-1] / numberTwo[number-1];
        System.out.println("La divicion es: " + result);    
    }    
    

}
