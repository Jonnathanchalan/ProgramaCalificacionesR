/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonnathan
 */
public class Estudiante extends Persona{
    
    //private Carrera carrera;
    private List<HistorialCalificaciones> historial;
    

    public Estudiante(){
        historial = new ArrayList<>();
    }
    
    public Estudiante(int codigo){
        super(codigo);
    }
    
    public Estudiante(int codigo, String nombre, String cedula){
        super(codigo, nombre, cedula);
    }

    public Estudiante(int codigo, String nombre, String cedula, String telefono, String direccion, String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);
        //this.carrera = carrera;
    }
    
    public void agregarHistorial(HistorialCalificaciones historial){
        this.historial.add(historial);
    }
    
/*
    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + ", sede=" + sede + "carrera=" + carrera + '}';
    }
    */

    @Override
    public String toString() {
        return "Estudiante{" + "historial=" + historial + '}';
    }
    
}
