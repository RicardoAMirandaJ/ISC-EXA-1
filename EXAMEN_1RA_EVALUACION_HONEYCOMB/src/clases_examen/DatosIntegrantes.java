/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

/**
 *
 * @author ricar
 */
public class DatosIntegrantes {
    
    //Datos de los integrantes del equipo
    private static String
            numControl1 = "22550339";
    private static String
            numControl2 = "22550351";
    private static String
            numControl3 = "22550328";
    private static String
            numControl4 = "22550382";
    private static String
            carrera = "Ingenieria en Sistemas Computacionales";
    private static String
            nombre1 = "Ricardo Alberto";
    private static String
            nombre2 = "Jesus Ivan";
    private static String
            nombre3 = "Axel Jasiel";
    private static String
            nombre4 = "Cristian Doan";
    private static String
            apellido1 = "Miranda Jimenez";
    private static String
            apellido2 = "Vargas Marquez";
    private static String
            apellido3 = "Hernandez Prieto";
    private static String
            apellido4 = "Trucios Escobar";
    private static String 
            nombreEquipo = "Honeycomb";
    
    //Problemas resueltos
    private static String
            problema1 = "CLASE TEST COVID";
    private static String
            problema2 = "CLASE CUENTA BANCARIA";
    private static String
            problema3 = "CLASE EMPLEADO";
    private static String
            problema4 = "CLASE DATOS DEL EQUIPO";
            
    //Método para imprimir los datos del equipo
    public static void imprimirDatosEquipo() {
        System.out.println("Datos del equipo:");
        System.out.println("Alumno 1: " + nombre1 + " " + apellido1);
        System.out.println("Numero de control: " + numControl1);
        System.out.println("Alumno 2: " + nombre2 + " " + apellido2);
        System.out.println("Numero de control: " + numControl2);
        System.out.println("Alumno 3: " + nombre3 + " " + apellido3);
        System.out.println("Numero de control: " + numControl3);
        System.out.println("Alumno 4: " + nombre4 + " " + apellido4);
        System.out.println("Numero de control: " + numControl4);
        System.out.println("Carrera: " + carrera);
        System.out.println("Nombre del equipo: " + nombreEquipo);
    }
    
    //Método para imprimir los problemas resueltos
    public static void imprimirProblemasResueltos() {
        System.out.println("Problemas resueltos:");
            System.out.println(problema1);
            System.out.println(problema2);
            System.out.println(problema3);
            System.out.println(problema4);
    }
}
