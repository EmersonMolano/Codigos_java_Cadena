/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import static com.mycompany.banco.Banco.aleatoreo;
import static com.mycompany.banco.Banco.cantidad;
import static com.mycompany.banco.Banco.ciudades;
import static com.mycompany.banco.Banco.teclado;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class Agregar {
        public static void agregar() {
        System.out.println("Ingrese la ciudad:");
        ciudades = teclado.nextLine();
        System.out.println("¿Cuántas sucursales quiere?");
        cantidad = teclado.nextInt();
        teclado.nextLine(); // limpiar buffer

        String[] sucursales = {"servientrega", "mercadolibre", "banco de bogota", "yuca", "papa", "bancolombia"};
        int[] sucursal = new int[12];

        Arrays.sort(sucursal);

        for (int i = 0; i < cantidad; i++) {
            sucursal[i] = aleatoreo.nextInt(sucursales.length);
            System.out.println("Ciudad: " + ciudades + ", sucursal #" + sucursal[i] + ": " + sucursales[sucursal[i]]);
        }
    }

}
