/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import static com.mycompany.banco.Banco.clientes;

/**
 *
 * @author User
 */
public class Mostrar {
        public static void mostrar() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }

        System.out.println(" Clientes y Productos Registrados ---");
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            System.out.println((i + 1) + ". Cliente: " + c.nombre + " y su producto es : " + c.producto);
        }
    }
}
