/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todo_diferentes_clases.newpackage;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class inicial{
    public static Scanner scanner = new Scanner(System.in);
        
    //Declaracion de variables publicas
    public static double number = 0;
    public static double numberOne, numberTwo, numberThree, result;
    public static int intOne, intTwo, intThree;
    public static String textOne;
    public static char charOne;
    public static boolean boolOne = false;
    

    public static void main(String[] args){
        int number = 0;

        //Eleccion
        do{
            System.out.println("¿Que deceas hacer?");
            System.out.print("Escribe el número de la operacion que vas a hacer: ");
            number = scanner.nextInt();
            //Es un condicional para que no se puedan insertar numeros negativos o mayores a 33 que es el Etxit.
                if(number <= 0 || number > 33){
                    while(number <= 0 || number > 33){
                    System.out.print("No se admiten valores fuera del rango admitodo, por favor ingresar otro: ");
                    number = scanner.nextInt();
                    }
                }
        }while(number == 33);
        switch (number) {
            case 1:{
                /*Aqui se le coloca el "ejercicio." que es el conector con la clase ejercicio1 y asubes el 
                    es el mismo nombre del archivo del cual ejecutara la informacion del codigo al ejecutarse.
                */
                ejercicio1.ejercicio1();
                break;
                }
            case 2:{
                ejercicio2.ejercicio2();
                break;
                }
            case 3:{
                ejercicio3.ejercicio3();
                break;
                }
            case 4:{
                ejercicio4.ejercicio4();
                break;
                }
            case 5:{
                ejercicio5.ejercicio5();
                break;
                }
            case 6:{
                ejercicio6.ejercicio6();
                break;
                }
            case 7:{
                ejercicio7.ejercicio7();
                break;
                }
            case 8:{
                ejercicio8.ejercicio8();
                break;
                }
           case 9:{
                ejercicio9.ejercicio9();
                break;
                }
            case 10:{
                ejercicio10.ejercicio10();
                break;
                }
            case 11:{
                ejercicio11.ejercicio11();
                break;
                }
            case 12:{
                ejercicio12.ejercicio12();
                break;
                }
            case 13:{
                ejercicio13.ejercicio13();
                break;
                }
            case 14:{
                ejercicio14.ejercicio14();
                break;
                }
            case 15:{
                ejercicio15.ejercicio15();
                break;
                }
            case 16:{
                ejercicio16.ejercicio16();
                break;
                }
            case 17:{
                ejercicio17.ejercicio17();
                break;
                }
            case 18:{
                ejercicio18.ejercicio18();
                break;
                }
            case 19:{
                ejercicio19.ejercicio19();
                break;
                }
            case 20:{
                ejercicio20.ejercicio20();
                break;
                }
            case 21:{
                ejercicio21.ejercicio21();
                break;
                }
            case 22:{
                ejercicio22.ejercicio22();
                break;
                }
            case 23:{
                ejercicio23.ejercicio23();
                break;
                }
            case 24:{
                ejercicio24.ejercicio24();
                break;
                }
            case 25:{
                ejercicio25.ejercicio25();
                break;
                }
            case 26:{
                ejercicio26.ejercicio26();
                break;
                }
            case 27:{
                ejercicio27.ejercicio27();
                break;
                }
            case 28:{
                ejercicio28.ejercicio28();
                break;
                }
            case 29:{
                ejercicio29.ejercicio29();
                break;
                }
            case 30:{
                ejercicio30.ejercicio30();
                break;
                }
            case 31:{
                ejercicio31.ejercicio31();
                break;
                }
            case 32:{
                ejercicio32.ejercicio32();
                break;
                }
            default:
                System.out.println("Has salido suerte.");
                break;
        }
    } 
}
