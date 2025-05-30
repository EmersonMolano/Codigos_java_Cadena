/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todo;
import java.util.Scanner;
/**
 *
 * @author SENA
 */
public class Todo {
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
            System.out.print("Escribe el número de la aoperacion que vas a hacer: ");
            number = scanner.nextInt();
                if(number <= 0){
                    while(number <= 0 || number > 36){
                    System.out.print("No se admiten valores fuera del rango admitodo, por favor ingresar otro: ");
                    number = scanner.nextInt();
                    }
                }
        }while(number == 33);
            switch (number) {
                case 1:{
                    ejercicio1();
                    break;
                    }
                case 2:{
                    ejercicio2();
                    break;
                    }
                case 3:{
                    ejercicio3();
                    break;
                    }
                case 4:{
                    ejercicio4();
                    break;
                    }
                case 5:{
                    ejercicio5();
                    break;
                    }
                case 6:{
                    ejercicio6();
                    break;
                    }
                case 7:{
                    ejercicio7();
                    break;
                    }
                case 8:{
                    ejercicio8();
                    break;
                    }
                case 9:{
                    ejercicio9();
                    break;
                    }
                case 10:{
                    ejercicio10();
                    break;
                    }
                case 11:{
                    ejercicio11();
                    break;
                    }
                case 12:{
                    ejercicio12();
                    break;
                    }
                case 13:{
                    ejercicio13();
                    break;
                    }
                case 14:{
                    ejercicio14();
                    break;
                    }
                case 15:{
                    ejercicio15();
                    break;
                    }
                case 16:{
                    ejercicio16();
                    break;
                    }
                case 17:{
                    ejercicio17();
                    break;
                    }
                case 18:{
                    ejercicio18();
                    break;
                    }
                case 19:{
                    ejercicio19();
                    break;
                    }
                case 20:{
                    ejercicio20();
                    break;
                    }
                case 21:{
                    ejercicio21();
                    break;
                    }
                case 22:{
                    ejercicio22();
                    break;
                    }
                case 23:{
                    ejercicio23();
                    break;
                    }
                case 24:{
                    ejercicio24();
                    break;
                    }
                case 25:{
                    ejercicio25();
                    break;
                    }
                case 26:{
                    ejercicio26();
                    break;
                    }
                case 27:{
                    ejercicio27();
                    break;
                    }
                case 28:{
                    ejercicio28();
                    break;
                    }
                case 29:{
                    ejercicio29();
                    break;
                    }
                case 30:{
                    ejercicio30();
                    break;
                    }
                case 31:{
                    ejercicio31();
                    break;
                    }
                case 32:{
                    ejercicio32();
                    break;
                    }
                default:
                    System.out.println("Has salido suerte.");
                    break;
            }
        }
    
    //Ejercicio 1
    private static void ejercicio1(){
        System.out.println("Ejercicio 1: Movimiento Uniforme");
        // Operación
        System.out.print("Ingrese la velocidad constante (m/s): ");
        numberOne = scanner.nextDouble();
        System.out.print("Ingrese el tiempo (s): ");
        numberTwo = scanner.nextDouble();
        result = numberOne * numberTwo;
        // Mostrar resultado
        System.out.println("Distancia recorrida: " + result + " metros");    
    }
    
    //Ejercicio 2
    private static void ejercicio2(){
        System.out.println("Ejercicio 2: Promedio Simple");
        // Operación
        System.out.print("Ingrese la primera nota: ");
        numberOne = scanner.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        numberTwo = scanner.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        numberThree = scanner.nextDouble();
        result = (numberOne + numberTwo + numberThree) / 3;
        // Mostrar resultado
        System.out.println("El promedio es: " + result);        
    
        
    }
    
    //Ejercicio 3
    private static void ejercicio3(){
        System.out.println("Ejercicio 3: Puntaje Final");
        // Operación
        System.out.print("Ingrese respuestas correctas: ");
        intOne = scanner.nextInt();
        System.out.print("Ingrese respuestas incorrectas: ");
        intTwo = scanner.nextInt();
        System.out.print("Ingrese respuestas en blanco: ");
        intThree = scanner.nextInt();
        result = (intOne * 4) + (intTwo * -1);
        // Mostrar resultado
        System.out.println("El puntaje final es: " + result);
    }
    
    //Ejercicio 4
    private static void ejercicio4(){
        System.out.println("Ejercicio 4: Puntaje Total");
        // Operación
        System.out.print("Ingrese partidos ganados: ");
        intOne = scanner.nextInt();
        System.out.print("Ingrese partidos empatados: ");
        intTwo = scanner.nextInt();
        result = (intOne * 3) + intTwo;
        // Mostrar resultado
        System.out.println("El puntaje total es: " + result);
    }
    
    //Ejercicio 5
    private static void ejercicio5(){
        System.out.println("Ejercicio 5: Planilla");
        // Operación
        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        numberOne = scanner.nextDouble();
        System.out.print("Ingrese la tarifa por hora: ");
        numberTwo = scanner.nextDouble();
        result = numberOne * numberTwo;
        // Mostrar resultado
        System.out.println("La planilla es: " + result);
    }
    
    //Ejercicio 6
    private static void ejercicio6(){
        System.out.println("Ejercicio 6: Área del Triángulo");
        // Operación
        System.out.print("Ingrese la longitud del lado A: ");
        numberOne = scanner.nextDouble();
        System.out.print("Ingrese la longitud del lado B: ");
        numberTwo = scanner.nextDouble();
        System.out.print("Ingrese la longitud del lado C: ");
        numberThree = scanner.nextDouble();
        result = (numberOne + numberTwo + numberThree) / 2;
        result = Math.sqrt(result * (result - numberOne) * (result - numberTwo) * (result - numberThree));
        // Mostrar resultado
        System.out.println("El área del triángulo es: " + result);
    }
    
    //Ejercicio 7
    private static void ejercicio7(){
        System.out.println("Ejercicio 7: Respaldo en CDs");
        // Operación
        System.out.print("Ingrese gigabytes: ");
        numberOne = scanner.nextDouble();
        result = (numberOne * 1024) / 700;
        // Mostrar resultado
        System.out.println("Se necesitan " + (int)Math.ceil(result) + " CDs");
    }
    
    //Ejercicio 8
    private static void ejercicio8(){
        System.out.println("Ejercicio 8: Distancia entre Puntos");
        // Operación
        System.out.print("Ingrese x1: ");
        numberOne = scanner.nextDouble();
        System.out.print("Ingrese y1: ");
        numberTwo = scanner.nextDouble();
        System.out.print("Ingrese x2: ");
        numberThree = scanner.nextDouble();
        System.out.print("Ingrese y2: ");
        result = scanner.nextDouble();
        // Mostrar resultado
        System.out.println("La distancia es: " + Math.sqrt(Math.pow(numberThree - numberOne, 2) + Math.pow(result - numberTwo, 2)));
    }
    
    //Ejercicio 9
    private static void ejercicio9(){
        System.out.println("Ejercicio 9: Verificación de CUIL");
        // Operación
        System.out.print("Ingrese el año de nacimiento: ");
        intOne = scanner.nextInt();
        System.out.print("Ingrese el año actual: ");
        intTwo = scanner.nextInt();
        result = intTwo - intOne;
        // Mostrar resultado
        if (result > 17) {
            System.out.println("Debe solicitar su CUIL");
        } else {
            System.out.println("No debe solicitar su CUIL aún");
        }
    }

    //Ejercicio 10
    private static void ejercicio10(){
        System.out.println("Ejercicio 10: Edad de Hermanos");
        // Operación
        System.out.print("Ingrese edad del primer hermano: ");
        intOne = scanner.nextInt();
        System.out.print("Ingrese edad del segundo hermano: ");
        intTwo = scanner.nextInt();
        result = Math.abs(intOne - intTwo);
        // Mostrar resultado
        System.out.println("Diferencia de edad: " + result + " años");
    }

    //Ejercicio 11
    private static void ejercicio11(){
        System.out.println("Ejercicio 11: Incentivo de Producción");
        // Operación
        System.out.print("Ingrese la producción del lunes: ");
        intOne = scanner.nextInt();
        System.out.print("Ingrese la producción del martes: ");
        intTwo = scanner.nextInt();
        System.out.print("Ingrese la producción del miércoles: ");
        intThree = scanner.nextInt();
        System.out.print("Ingrese la producción del jueves: ");
        numberOne = scanner.nextDouble();
        System.out.print("Ingrese la producción del viernes: ");
        numberTwo = scanner.nextDouble();
        System.out.print("Ingrese la producción del sábado: ");
        numberThree = scanner.nextDouble();
        result = (intOne + intTwo + intThree + numberOne + numberTwo + numberThree) / 6.0;
        // Mostrar resultado
        if (result >= 100) {
            System.out.println("Recibirá Incentivos");
        } else {
            System.out.println("No Recibirá Incentivos");
        }    
    }
    
    //Ejercicio 12
    private static void ejercicio12(){
        System.out.println("Ejercicio 12: Máximo de Tres");
        // Operación
        System.out.print("Ingrese el primer número: ");
        intOne = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        intTwo = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        intThree = scanner.nextInt();
        if (intOne > intTwo && intOne > intThree) {
            result = intOne;
        } else if (intTwo > intThree) {
            result = intTwo;
        } else {
            result = intThree;
        }
        // Mostrar resultado
        System.out.println("El número mayor es: " + result);
    }
    
    //Ejercicio 13
    private static void ejercicio13(){
        System.out.println("Ejercicio 13: Tipo de Triángulo");
        // Operación
        System.out.print("Ingrese el primer lado: ");
        intOne = scanner.nextInt();
        System.out.print("Ingrese el segundo lado: ");
        intTwo = scanner.nextInt();
        System.out.print("Ingrese el tercer lado: ");
        intThree = scanner.nextInt();
        if (intOne != intTwo && intTwo != intThree && intOne != intThree) {
            textOne = "Escaleno";
        } else if (intOne == intTwo && intTwo == intThree) {
            textOne = "Equilátero";
        } else {
            textOne = "Isósceles";
        }
        // Mostrar resultado
        System.out.println("Tipo de triángulo: " + textOne);
    }
    //Ejercicio 14
    private static void ejercicio14(){
        System.out.println("Ejercicio 14: Número Romano");
        // Operación
        System.out.print("Ingrese un número entero (1 a 10): ");
        intOne = scanner.nextInt();
        switch (intOne) {
            case 1: textOne = "I"; break;
            case 2: textOne = "II"; break;
            case 3: textOne = "III"; break;
            case 4: textOne = "IV"; break;
            case 5: textOne = "V"; break;
            case 6: textOne = "VI"; break;
            case 7: textOne = "VII"; break;
            case 8: textOne = "VIII"; break;
            case 9: textOne = "IX"; break;
            case 10: textOne = "X"; break;
            default: textOne = "Valor incorrecto";
        }
        // Mostrar resultado
        System.out.println("Equivalente en romano: " + textOne);
    }
    
    //Ejercicio 15
    private static void ejercicio15(){
        System.out.println("Ejercicio 15: Bonificación de Ventas");
        // Operación
        System.out.print("Ingrese el monto de venta: ");
        numberOne = scanner.nextDouble();
        result = 0; // Inicializamos result
        if (numberOne >= 0 && numberOne < 1000) {
            result = 0;
        } else if (numberOne >= 1000 && numberOne < 5000) {
            result = (3 * numberOne) / 100;
        } else if (numberOne >= 5000 && numberOne < 20000) {
            result = (5 * numberOne) / 100;
        } else if (numberOne >= 20000) {
            result = (8 * numberOne) / 100;
        }
        // Mostrar resultado
        System.out.println("La bonificación es: " + result);    
    }
    
    //Ejercicio 16
    private static void ejercicio16(){
        System.out.println("Ejercicio 16: Mensaje de Vocal");
        // Operación
        System.out.print("Ingrese un número entero (1 a 5): ");
        intOne = scanner.nextInt();
        switch (intOne) {
            case 1: textOne = "A"; break;
            case 2: textOne = "E"; break;
            case 3: textOne = "I"; break;
            case 4: textOne = "O"; break;
            case 5: textOne = "U"; break;
            default: textOne = "Valor Incorrecto";
        }
        // Mostrar resultado
        System.out.println("La vocal correspondiente es: " + textOne);
    }
    
    //Ejercicio 17
    private static void ejercicio17(){
        System.out.println("Ejercicio 17: Unidades y Decenas");
        // Operación
        System.out.print("Ingrese un número entero de dos cifras: ");
        intOne = scanner.nextInt();
        intTwo = intOne / 10;
        intThree = intOne % 10;
        // Mostrar resultado
        System.out.println("Decenas: " + intTwo);
        System.out.println("Unidades: " + intThree);
    }
    
    //Ejercicio 18
    private static void ejercicio18(){
        System.out.println("Ejercicio 18: Par o Impar");
        // Operación
        System.out.print("Ingrese un número entero diferente de cero: ");
        intOne = scanner.nextInt();
        if (intOne % 2 == 0) {
            textOne = "Es Par";
        } else {
            textOne = "Es Impar";
        }
        // Mostrar resultado
        System.out.println(textOne);
    }
    
    //Ejercicio 19
    private static void ejercicio19(){
        System.out.println("Ejercicio 19: Números Pares");
        // Operación
        intOne = 2;
        while (intOne <= 10) {
            System.out.println(intOne);
            intOne += 2;
        }
        // Mostrar resultado (ya se muestran en el ciclo)        
    }
    
    //Ejercicio 20
    private static void ejercicio20(){
        System.out.println("Ejercicio 20: Promedio de Sueldos");
        // Operación
        System.out.print("Ingrese el número de empleados: ");
        intOne = scanner.nextInt();
        result = 0;
        for (intTwo = 1; intTwo <= intOne; intTwo++) {
            System.out.print("Ingrese el sueldo del empleado " + intTwo + ": ");
            numberOne = scanner.nextDouble();
            result += numberOne;
        }
        result = result / intOne;
        // Mostrar resultado
        System.out.println("El sueldo promedio es: " + result);
    }
    
    //Ejercicio 21
    private static void ejercicio21(){
        System.out.println("Ejercicio 21: Conteo de Edades");
        // Operación
        intOne = 1;
        intTwo = 0;
        intThree = 0;
        while (intOne <= 200) {
            System.out.print("Ingrese la edad de la persona " + intOne + ": ");
            numberOne = scanner.nextDouble();
            if (numberOne < 18) {
                intTwo++;
            } else {
                intThree++;
            }
            intOne++;
        }
        // Mostrar resultado
        System.out.println("Mayores de edad: " + intThree);
        System.out.println("Menores de edad: " + intTwo);    
    }
    
    //Ejercicio 22
    private static void ejercicio22(){
        System.out.println("Ejercicio 22: Multiplicación por Suma");
        // Operación
        System.out.print("Ingrese el primer número: ");
        intOne = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        intTwo = scanner.nextInt();
        result = 0;
        for (intThree = 1; intThree <= intTwo; intThree++) {
            result += intOne;
        }
        // Mostrar resultado
        System.out.println("El producto es: " + result);
    }
    
    //Ejercicio 23
    private static void ejercicio23(){
        System.out.println("Ejercicio 23: Números Impares");
        // Operación
        intOne = 1;
        intTwo = 0;
        while (intTwo < 10) {
            if (intOne % 2 != 0) {
                System.out.println(intOne);
                intTwo++;
            }
            intOne++;
        }
        // Mostrar resultado (ya se muestran en el ciclo)    
    }
    
    //Ejercicio 24
    private static void ejercicio24(){
        System.out.println("Ejercicio 24: Serie Menor que 1000");
        // Operación
        intOne = 1;
        while (intOne < 1000) {
            System.out.println(intOne);
            intOne = (intOne * intOne) + 1;
        }
        // Mostrar resultado (ya se muestran en el ciclo)    
    }
    
    //Ejercicio 25
    private static void ejercicio25(){
        System.out.println("Ejercicio 25: Entrada de Vocal");
        // Operación
        do {
            System.out.print("Ingrese una letra: ");
            charOne = scanner.next().toLowerCase().charAt(0);
            boolOne = (charOne == 'a' || charOne == 'e' || charOne == 'i' || charOne == 'o' || charOne == 'u');
        } while (!boolOne);
        // Mostrar resultado
        System.out.println("Ingresó una vocal: " + charOne);   
    }
    
    //Ejercicio 26
    private static void ejercicio26(){
        System.out.println("Ejercicio 26: Serie Fibonacci");
        // Operación
        intOne = 0;
        intTwo = 1;
        intThree = 0;
        System.out.println(intOne);
        System.out.println(intTwo);
        while (intThree < 100000) {
            intThree = intOne + intTwo;
            if (intThree < 100000) {
                System.out.println(intThree);
            }
            intOne = intTwo;
            intTwo = intThree;
        }
        // Mostrar resultado (ya se muestran en el ciclo)        
    }
    
    //Ejercicio 27
    private static void ejercicio27(){
        System.out.println("Ejercicio 27: Operación Aritmética");
        // Operación
        System.out.print("Ingrese el primer número: ");
        intOne = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        intTwo = scanner.nextInt();
        System.out.print("Ingrese el operador (+, -, *, ^): ");
        charOne = scanner.next().charAt(0);
        switch (charOne) {
            case '+': result = intOne + intTwo; break;
            case '-': result = intOne - intTwo; break;
            case '*': result = intOne * intTwo; break;
            case '^': result = Math.pow(intOne, intTwo); break;
            default: result = 0;
        }
        // Mostrar resultado
        System.out.println("El resultado es: " + result);    
    }
    
    //Ejercicio 28
    private static void ejercicio28(){
        System.out.println("Ejercicio 28: Vocales y Consonantes");
        // Operación
        intOne = 0;
        intTwo = 0;
        intThree = 1;
        while (intThree <= 10) {
            System.out.print("Ingrese una letra: ");
            charOne = scanner.next().toLowerCase().charAt(0);
            if (charOne == 'a' || charOne == 'e' || charOne == 'i' || charOne == 'o' || charOne == 'u') {
                intOne++;
            } else {
                intTwo++;
            }
            intThree++;
        }
        // Mostrar resultado
        System.out.println("Número de vocales: " + intOne);
        System.out.println("Número de consonantes: " + intTwo);
    }
    
    //Ejercicio 29
    private static void ejercicio29(){
        System.out.println("Ejercicio 29: Mayoría Simple");
        // Operación
        intOne = 0;
        intTwo = 0;
        intThree = 0;
        numberOne = 0;
        for (numberTwo = 1; numberTwo <= 160; numberTwo++) {
            System.out.print("Ingrese el voto del elector (1, 2, 3, otro): ");
            numberThree = scanner.nextDouble();
            switch ((int)numberThree) {
                case 1: intOne++; break;
                case 2: intTwo++; break;
                case 3: intThree++; break;
                default: numberOne++;
            }
        }
        // Mostrar resultado
        if (intOne > intTwo && intOne > intThree && intOne > numberOne) {
            result = 1;
        } else if (intTwo > intThree && intTwo > numberOne) {
            result = 2;
        } else if (intThree > numberOne) {
            result = 3;
        } else {
            result = 0;
        }
        System.out.println("El ganador es el candidato: " + result);
    }
    
    //Ejercicio 30
    private static void ejercicio30(){
        System.out.println("Ejercicio 30: Promedio de Dos Números");
        // Operación
        System.out.print("Ingrese el primer número: ");
        numberOne = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        numberTwo = scanner.nextDouble();
        result = (numberOne + numberTwo) / 2;
        // Mostrar resultado
        System.out.println("El promedio es: " + result);
    }
    
    //Ejercicio 31
    private static void ejercicio31(){
        System.out.println("Ejercicio 31: Nombre del Mes");
        // Operación
        System.out.print("Ingrese el número del mes (1-12): ");
        intOne = scanner.nextInt();
        switch (intOne) {
            case 1: textOne = "Enero"; break;
            case 2: textOne = "Febrero"; break;
            case 3: textOne = "Marzo"; break;
            case 4: textOne = "Abril"; break;
            case 5: textOne = "Mayo"; break;
            case 6: textOne = "Junio"; break;
            case 7: textOne = "Julio"; break;
            case 8: textOne = "Agosto"; break;
            case 9: textOne = "Septiembre"; break;
            case 10: textOne = "Octubre"; break;
            case 11: textOne = "Noviembre"; break;
            case 12: textOne = "Diciembre"; break;
            default: textOne = "Mes inválido";
        }
        // Mostrar resultado
        System.out.println("El mes es: " + textOne);
    }
    
    //Ejercicio 32
    private static void ejercicio32(){
        System.out.println("Ejercicio 32: Divisores");
        // Operación
        System.out.print("Ingrese un número entero diferente de cero: ");
        intOne = scanner.nextInt();
        System.out.println("Los divisores de " + intOne + " son:");
        for (intTwo = 1; intTwo <= Math.abs(intOne); intTwo++) {
            if (intOne % intTwo == 0) {
                System.out.println(intTwo);
            }
        }
        // Mostrar resultado (ya se muestran en el ciclo)    
    }
}
