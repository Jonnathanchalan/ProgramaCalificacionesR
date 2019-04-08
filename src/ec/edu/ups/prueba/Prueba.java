/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.Carrera;
import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Grupo;
import ec.edu.ups.clases.HistorialCalificaciones;
import ec.edu.ups.clases.Materia;
import ec.edu.ups.clases.Persona;
import ec.edu.ups.clases.Profesor;
import ec.edu.ups.clases.Sede;
/**
 *
 * @author Usuario
 */
public class Prueba {

    private static Estudiante jonnathan;
    
    public static void main(String[] args){
    
        Sede sedeCuenca = new Sede(1, "Sede Cuenca", "Calle vieja", "3012112");
        
        Carrera computacion = new Carrera(5, "Computacion", 1, 200, "Ingenieria en ciencias de la computacion");
        Carrera telematica = new Carrera(8, "Sistemas", 2, 300, "Ingenieria en Sistemas");
        Carrera mecatronica = new Carrera(9, "Civil", 6, 200, "Ingenieria civil");
        
        Materia programacion = new Materia(4, "Fundamentos de Programacion", 6, 240, 3);
        Materia baseDatos = new Materia(2, "Sistemas Operativos", 4, 180, 3);
        Materia ecuaciones = new Materia(9, "Ecuaciones Diferenciales", 6, 240, 2);
        Materia logica = new Materia(67, "Teoria Critica", 4, 160, 1);
        Materia fisica = new Materia(34, "Fisica", 6, 240, 1);
        Materia algebra = new Materia(1, "Ingles", 6, 240, 1);
        
        Profesor luisGonzales = new Profesor("Ingeniero", 2500, "Profesor", 23, "Luis Gonzales", "0102351754", "098743441", "Desconocida", "gleon@ups");
        Profesor walterVerdugo = new Profesor("Ingeniero", 2500, "Profesor", 45, "Walter Verdugo", "0106381154", "098243341", "Desconocida", "pingavelez@ups");
        
        Estudiante ivan = new Estudiante(4, "Ivan Sanchez", "0106073331", "3012113", "Gustavo Lemus", "isanchez@est.ups.edu.ec");
        Estudiante vinicio = new Estudiante(79, "Vinicio Campoverde", "0109568077", "0993127549", "Cuenca", "vcampoverde@est.ups.edu.ec");
        Estudiante jose = new Estudiante(12, "Jose Tapia", "0106882245", "2274876", "Cuenca", "gtapia@est.ups.edu.ec");
        Estudiante byron = new Estudiante(79, "Byron Godoy", "0104446726", "2670144", "Paute", "bgodoy@est.ups.edu.ec");
        
        Grupo numero1 = new Grupo(4, "Grupo numero 1", 5);
        Grupo numero2 = new Grupo(5, "Grupo numero 2", 8);
        
        sedeCuenca.agregarCarrera(mecatronica);
        sedeCuenca.agregarCarrera(computacion);
        sedeCuenca.agregarCarrera(telematica);
        
        mecatronica.agregarMateria(algebra);
        mecatronica.agregarMateria(fisica);
        computacion.agregarMateria(programacion);
        computacion.agregarMateria(baseDatos);
        telematica.agregarMateria(logica);
        telematica.agregarMateria(ecuaciones);
        
        algebra.setGrupo(numero2);
        fisica.setGrupo(numero2);
        programacion.setGrupo(numero2);
        baseDatos.setGrupo(numero1);
        logica.setGrupo(numero1);
        ecuaciones.setGrupo(numero1);
        
        algebra.setProfesor(luisGonzales);
        fisica.setProfesor(walterVerdugo);
        programacion.setProfesor(luisGonzales);
        baseDatos.setProfesor(walterVerdugo);
        logica.setProfesor(luisGonzales);
        ecuaciones.setProfesor(walterVerdugo);
        
        HistorialCalificaciones historialjonnathan1 = new HistorialCalificaciones(programacion, jonnathan, 9, 9, 10, 9);
        
        
        jonnathan.agregarHistorial(historialjonnathan1);
        
    }
}
