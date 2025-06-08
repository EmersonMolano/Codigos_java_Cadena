/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingresar_datos;

public class verificar {
    public static boolean existeDato(String[] arreglo, String dato, int cantidad) {
        for (int j = 0; j < cantidad; j++) {
            if (arreglo[j] != null && arreglo[j].equalsIgnoreCase(dato)) {
                return true;
            }
        }
        return false;
    }

    public static boolean existeDatoLong(long[] arreglo, long dato, int cantidad) {
        for (int j = 0; j < cantidad; j++) {
            if (arreglo[j] == dato) {
                return true;
            }
        }
        return false;
    }
} 