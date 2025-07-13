/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


public class Banco {
    public static Banco bn = new Banco();
    public static Scanner teclado = new Scanner(System.in);
    public static Random aleatoreo = new Random();

    public static int cantidad, opcion, tipo;
    public static String ciudades, cliente, nombreCampaña;

    public static List<String> campañas = new ArrayList<>();
    public static List<Cliente> clientes = new ArrayList<>(); // Lista de clientes

    public static void main(String[] args) {
   
      

        
        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Agregar ciudad y sucursales");
            System.out.println("2. Registrar cliente y producto");
            System.out.println("3. Gestionar campañas");
            System.out.println("4. Mostrar clientes y productos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    Agregar.agregar();
                break;
                case 2 -> Producto.productos();
                case 3 -> Campaña.gestionarCampañas();
                case 4 -> Producto.mostrarClientes();
                case 0 -> System.out.println("Saliendo del sistema.");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }


  
   



}






    




