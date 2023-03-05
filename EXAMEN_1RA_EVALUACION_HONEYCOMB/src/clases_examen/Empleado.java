/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

/**
 *
 * @author ricar
 */
public class Empleado {

    private String nombre;
    private String apellido;
    private String direccion;
    private int anioIngreso;
    private double salario;

    // Constructor sin parámetros
    public Empleado() {
        nombre = "Daniel Elier";
        apellido = "Barrios Gutierrez";
        direccion = "Fraccionamiento Villa Dorada";
        anioIngreso = 2020;
        salario = 4000;
    }

    // Constructor con parámetros
    public Empleado(String OtroNombre, String OtroApellido, String OtraDireccion, int OtroAnioIngreso, double OtroSalario) {
        nombre = OtroNombre;
        apellido = OtroApellido;
        direccion = OtraDireccion;
        anioIngreso = OtroAnioIngreso;
        salario = OtroSalario;
    }

    // Métodos "set"
    public void setNombre(String valor) {
        nombre = valor;
    }

    public void setApellido(String valor) {
        apellido = valor;
    }

    public void setDireccion(String valor) {
        direccion = valor;
    }

    public void setAnioIngreso(int valor) {
        anioIngreso = valor;
    }

    public void setSalario(double valor) {
        salario = valor;
    }

    // Métodos "get"
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public double getSalario() {
        return salario;
    }

    // Método para calcular los días de vacaciones
    public int calcularVacaciones() {
        int diasVacaciones = 6; // Por defecto, si tiene un año de antigüedad
        int antiguedad = 2023 - anioIngreso;
        if (antiguedad > 1) {
            diasVacaciones += (antiguedad - 1) * 2; // Se agregan 2 días por cada año adicional
            if (antiguedad % 5 == 0) {
                diasVacaciones += 2; // Se agregan 2 días adicionales cada 5 años laborados
            }
        }
        return diasVacaciones;
    }

    // Método para imprimir los datos del empleado
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Direccion: " + direccion);
        System.out.println("Anio de ingreso: " + anioIngreso);
        System.out.println("Salario: $" + salario);
        System.out.println("Dias de vacaciones: " + calcularVacaciones());
    }

}
