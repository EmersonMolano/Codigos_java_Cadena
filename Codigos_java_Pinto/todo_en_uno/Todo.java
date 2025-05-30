import java.util.Scanner;

public class Todo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        // Variables comunes que se reutilizarán
        double numberOne, numberTwo, numberThree, result;
        int intOne, intTwo, intThree;
        String textOne;
        char charOne;
        boolean boolOne;

        while (number != 0) {
            System.out.println("\nEscribe el numero del ejercicio que quieras revisar (1-32): ");
            number = Integer.parseInt(scanner.nextLine());

            switch (number) {
                case 1:
                    System.out.println("Ejercicio 1: Movimiento Uniforme");
                    // Operación
                    System.out.print("Ingrese la velocidad constante (m/s): ");
                    numberOne = scanner.nextDouble();
                    System.out.print("Ingrese el tiempo (s): ");
                    numberTwo = scanner.nextDouble();
                    result = numberOne * numberTwo;
                    // Mostrar resultado
                    System.out.println("Distancia recorrida: " + result + " metros");
                    break;

                case 2:
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
                    break;

                case 3:
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
                    break;

                case 4:
                    System.out.println("Ejercicio 4: Puntaje Total");
                    // Operación
                    System.out.print("Ingrese partidos ganados: ");
                    intOne = scanner.nextInt();
                    System.out.print("Ingrese partidos empatados: ");
                    intTwo = scanner.nextInt();
                    result = (intOne * 3) + intTwo;
                    // Mostrar resultado
                    System.out.println("El puntaje total es: " + result);
                    break;

                case 5:
                    System.out.println("Ejercicio 5: Planilla");
                    // Operación
                    System.out.print("Ingrese el número de horas trabajadas en el mes: ");
                    numberOne = scanner.nextDouble();
                    System.out.print("Ingrese la tarifa por hora: ");
                    numberTwo = scanner.nextDouble();
                    result = numberOne * numberTwo;
                    // Mostrar resultado
                    System.out.println("La planilla es: " + result);
                    break;

                case 6:
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
                    break;

                case 7:
                    System.out.println("Ejercicio 7: Respaldo en CDs");
                    // Operación
                    System.out.print("Ingrese gigabytes: ");
                    numberOne = scanner.nextDouble();
                    result = (numberOne * 1024) / 700;
                    // Mostrar resultado
                    System.out.println("Se necesitan " + (int)Math.ceil(result) + " CDs");
                    break;

                case 8:
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
                    break;

                case 9:
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
                    break;

                case 10:
                    System.out.println("Ejercicio 10: Edad de Hermanos");
                    // Operación
                    System.out.print("Ingrese edad del primer hermano: ");
                    intOne = scanner.nextInt();
                    System.out.print("Ingrese edad del segundo hermano: ");
                    intTwo = scanner.nextInt();
                    result = Math.abs(intOne - intTwo);
                    // Mostrar resultado
                    System.out.println("Diferencia de edad: " + result + " años");
                    break;

                case 11:
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
                    break;

                case 12:
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
                    break;

                case 13:
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
                    break;

                case 14:
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
                    break;

                case 15:
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
                    break;

                case 16:
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
                    break;

                case 17:
                    System.out.println("Ejercicio 17: Unidades y Decenas");
                    // Operación
                    System.out.print("Ingrese un número entero de dos cifras: ");
                    intOne = scanner.nextInt();
                    intTwo = intOne / 10;
                    intThree = intOne % 10;
                    // Mostrar resultado
                    System.out.println("Decenas: " + intTwo);
                    System.out.println("Unidades: " + intThree);
                    break;

                case 18:
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
                    break;

                case 19:
                    System.out.println("Ejercicio 19: Números Pares");
                    // Operación
                    intOne = 2;
                    while (intOne <= 10) {
                        System.out.println(intOne);
                        intOne += 2;
                    }
                    // Mostrar resultado (ya se muestran en el ciclo)
                    break;

                case 20:
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
                    break;

                case 21:
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
                    break;

                case 22:
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
                    break;

                case 23:
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
                    break;

                case 24:
                    System.out.println("Ejercicio 24: Serie Menor que 1000");
                    // Operación
                    intOne = 1;
                    while (intOne < 1000) {
                        System.out.println(intOne);
                        intOne = (intOne * intOne) + 1;
                    }
                    // Mostrar resultado (ya se muestran en el ciclo)
                    break;

                case 25:
                    System.out.println("Ejercicio 25: Entrada de Vocal");
                    // Operación
                    boolOne = false;
                    do {
                        System.out.print("Ingrese una letra: ");
                        charOne = scanner.next().toLowerCase().charAt(0);
                        boolOne = (charOne == 'a' || charOne == 'e' || charOne == 'i' || charOne == 'o' || charOne == 'u');
                    } while (!boolOne);
                    // Mostrar resultado
                    System.out.println("Ingresó una vocal: " + charOne);
                    break;

                case 26:
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
                    break;

                case 27:
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
                    break;

                case 28:
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
                    break;

                case 29:
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
                    break;

                case 30:
                    System.out.println("Ejercicio 30: Promedio de Dos Números");
                    // Operación
                    System.out.print("Ingrese el primer número: ");
                    numberOne = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    numberTwo = scanner.nextDouble();
                    result = (numberOne + numberTwo) / 2;
                    // Mostrar resultado
                    System.out.println("El promedio es: " + result);
                    break;

                case 31:
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
                    break;

                case 32:
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
                    break;

                default:
                    System.out.println("Número de ejercicio inválido");
                    break;
            }
        }
    scanner.close();
    }
}
