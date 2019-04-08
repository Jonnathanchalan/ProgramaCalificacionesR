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
        /*
        
        Luego
        
        4 listas
        1 objeto por cada materia que tenga el estudiante
        al final imprimir
        //Estudiante
        Estudiante eduardo = new Estudiante();
        eduardo.setCodigo(154);
        eduardo.setCedula("0106073331");
        eduardo.setCorreo("aayorao@est.ups.edu.ec");
        eduardo.setDireccion("Mercado 12 de abriil");
        eduardo.setNombre("Eduardo Antonio Ayora Ochoa");
        eduardo.setTelefono("3012113");
        
        //Grupo
        Grupo grupo1 = new Grupo();
        grupo1.setCodigo(1);
        grupo1.setCupo(6);
        grupo1.setNombre("Grupo 1");
        
        //Materia
        Materia programacion = new Materia();
        programacion.setCodigo(12);
        programacion.setGrupo(grupo1);
        programacion.setNivel(3);
        programacion.setNombre("Programación aplicada");
        programacion.setNumeroCreditos(6);
        programacion.setNumeroHoras(240);
        //programacion.setProfesor(profesor);----------------------------------------------
        
        //Carrera
        Carrera computacion = new Carrera();
        computacion.agregarMateria(programacion);
        computacion.setCodigo(9);
        computacion.setNombre("Ingenieria en Computación");
        computacion.setNumeroEstudiantes(300);
        computacion.setNumeroSemestre(10);
        computacion.setTitulo("Ingeniero en ciencias de la computación");
        
        //Sede
        Sede cuenca = new Sede();
        cuenca.setCodigo(1);
        cuenca.setDireccion("Calle Vieja 12-30 y Elia Liut");
        cuenca.setNombre("El vecino");
        cuenca.setTelefono("74135250");
        cuenca.agregarCarrera(computacion);
        
        //Profesor
        Profesor profesor = new Profesor();
        profesor.setCargo("Profesor");
        profesor.setCedula("0102351758");
        profesor.setCodigo(56);
        profesor.setCorreo("aayorao@ups.edu.ec");
        profesor.setDireccion("Desconocida");
        profesor.setNombre("Antonio Ochoa");
        profesor.setSalario(2500);
        profesor.setSede(cuenca);
        
        System.out.println(profesor);
        
        //Historial
        HistorialCalificaciones historial = new HistorialCalificaciones();
        historial.setAprovechamiento1(10);
        historial.setExamen1(10);
        historial.setMateria(programacion);
        historial.setEstudiante(eduardo);*/
        
    
        
        
    }
}
