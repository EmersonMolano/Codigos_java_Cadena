/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Hacegurarse que estas dos lineas esten creadas ya que al no estar va a dar error 
package todo_diferentes_clases.newpackage;
import static todo_diferentes_clases.newpackage.inicial.scanner;

/**
 *
 * @author SENA
 */
//No usar el extends ya que el Instructor me dijo que nolo usara
public class ejercicio1 /*extends inicial*/{

    //Esto hace que pueda usar el scanner de la clase inicial y tambien 
    //me ayuda a usar las variables globales o tambien dicha publicas de "inicial"
    public static inicial in = new inicial();
    
    /*Ejecucion del ejercicio
    //Se copia y pega de manera facil el ejercicio public y ya antes lo has creado
    //Ahora como hantes visto se creo un "in" para llamar a inicial, esto se deve
    // poner antes de cada variable como se muestra a continuacion:
        in.numberOne - aqui se esta llamando las barriables globales de "inicial"
                    que estan definidas en un public static
        es lo mismo para todas las variables en el caso del ejemplo anterior se esta diciendo que 
        "in.numberOne" va a quedar como si ya estubiera declarada como "double" en este caso,
        eso sera todo graxie por su tiempo :3.
    
    */
    public static void ejercicio1(){
        System.out.println("Ejercicio 1: Movimiento Uniforme");
        // Operación
        System.out.print("Ingrese la velocidad constante (m/s): ");
        //Aqui esta numberOne que aclare anteriormente como funciona y la necesidad obligatoria del "in." .
        in.numberOne = scanner.nextDouble();
        System.out.print("Ingrese el tiempo (s): ");
        in.numberTwo = scanner.nextDouble();
        in.result = in.numberOne * in.numberTwo;
        // Mostrar resultado
        System.out.println("Distancia recorrida: " + in.result + " metros");    
    }    
}
