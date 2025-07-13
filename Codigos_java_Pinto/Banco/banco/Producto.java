/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import static com.mycompany.banco.Banco.cliente;
import static com.mycompany.banco.Banco.clientes;
import static com.mycompany.banco.Banco.opcion;
import static com.mycompany.banco.Banco.teclado;

/**
 *
 * @author User
 */
public class Producto {
      public static void productos() {
        teclado.nextLine(); // limpiar buffer

        System.out.println("Ingrese nombre del cliente:");
        cliente = teclado.nextLine().trim();

        if (cliente.isEmpty()) {
            System.out.println("Nombre no válido.");
            return;
        }

        String[] producto = {"CAA", "CAC", "CDT", "TC", "Préstamos Libres", "Préstamos LI", "Préstamos H"};

        System.out.println("Productos disponibles:");
        for (int i = 0; i < producto.length; i++) {
            System.out.println("  " + (i + 1) + ". " + producto[i]);
        }

        System.out.print("Seleccione un producto (1-" + producto.length + "): ");
        if (!teclado.hasNextInt()) {
            System.out.println("Entrada inválida.");
            teclado.nextLine(); // limpiar
            return;
        }

        opcion = teclado.nextInt();
        teclado.nextLine(); // limpiar buffer

        if (opcion >= 1 && opcion <= producto.length) {
            String productoSeleccionado = producto[opcion - 1];
            clientes.add(new Cliente(cliente, productoSeleccionado)); // Guardar cliente
            System.out.println("Cliente registrado: " + cliente + " | Producto: " + productoSeleccionado);
        } else {
            System.out.println("Opción no válida.");
        }
    }
}
