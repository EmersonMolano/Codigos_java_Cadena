/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

/**
 *
 * @author Familia M.C
 */
public class BuscarConductor {
    public static Datos da = new Datos();
    public static int buscarConductor(String nombre) {
    for (int i = 0; i < 10; i++) {
        if (da.conductores[i][0] != null && da.conductores[i][0].equalsIgnoreCase(nombre)) {
            return i;
        }
    }
    return -1;
}

}
