/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

/**
 *
 * @author ricar
 */
public class CuentaBancaria {

    private String numeroCuenta;
    private String cliente;
    private double saldo;

    // Constructor sin parámetros
    public CuentaBancaria() {
        numeroCuenta = "";
        cliente = "";
        saldo = 0;
    }

    // Constructor con parámetros
    public CuentaBancaria(String OtroNumeroCuenta, String OtroCliente, double OtroSaldo) {
        numeroCuenta = OtroNumeroCuenta;
        cliente = OtroCliente;
        saldo = OtroSaldo;
    }

    // Métodos set
    public void setNumeroCuenta(String valor) {
        numeroCuenta = valor;
    }

    public void setCliente(String valor) {
        cliente = valor;
    }

    // Método get para obtener el valor de cada atributo
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para depositar en la cuenta
    public void depositarEnCuenta(double monto) {
        saldo += monto;
    }

    // Método para retirar de la cuenta
    public void retirarDeCuenta(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    // Método para imprimir los datos del cliente
    public void imprimirDatos() {
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: " + saldo);
    }
}
