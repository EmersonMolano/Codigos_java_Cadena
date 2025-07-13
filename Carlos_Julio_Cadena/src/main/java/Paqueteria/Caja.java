/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paqueteria;

/**
 *
 * @author La manada del Sena
 */

import java.util.ArrayList; //Crea una lista como si muera un Array
import java.util.List; //Reglas de lista

public class Caja implements Item {
    //Se crea una lista para mejor orden
    private List<Item> contenidos = new ArrayList<>();
    private double costoEmpaque;

    
    public Caja(double costoEmpaque) {
        this.costoEmpaque = costoEmpaque;
    }
    
    //Se esta agregando un nuevo Item a la lista
    public void agregar(Item item) {
        contenidos.add(item);
    }

    @Override 
    public double obtenerPrecio() {
        double total = costoEmpaque;
        for (Item item : contenidos) {
            total += item.obtenerPrecio();
        }
        return total;
    }
    
    //Aqui se esta haciendo el mensaje que se mostraria
    @Override //
    public String toString() {
        return "Caja (empaque: $" + costoEmpaque + ", items: " + contenidos.size() + ")";
    }
}
