/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paqueteria;

/**
 *
 * @author La manada del Sena
 */
//Se IMPLEMENTA el contenido de la Clase Item
//que seria obtenerPrecio
public class Producto implements Item {
    
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    
    @Override
    //
    public String toString() {
        return nombre + ": $" + precio;
    }
}
