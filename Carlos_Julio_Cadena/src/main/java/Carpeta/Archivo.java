/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carpeta;

/**
 *
 * @author Familia M.C
 */
public class Archivo implements ElementoSistema {
    private String nombre;
    
    public Archivo(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String mostrarContenido(){
        return nombre;
    
    }
}
