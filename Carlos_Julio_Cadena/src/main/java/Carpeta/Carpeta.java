/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carpeta;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Familia M.C
 */
public class Carpeta implements ElementoSistema{
    private String nombre;
    private List<ElementoSistema> elementos = new ArrayList<>();
    
    public Carpeta(String nombre){
        this.nombre = nombre;
    }
    
    public void agregar(ElementoSistema elemento){
        elementos.add(elemento);
    }
    
    @Override
    public String mostrarContenido() {
        StringBuilder resultado = new StringBuilder(nombre + "[");
        for (ElementoSistema e : elementos){
            resultado.append(e.mostrarContenido()).append(", ");
        }
        if (!elementos.isEmpty()) {
            resultado.setLength(resultado.length()-2);
        }
        
        resultado.append("]");
        return resultado.toString();
    }
}
