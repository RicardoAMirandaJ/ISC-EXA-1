/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

/**
 *
 * @author ricar
 */
public class TestCovid {

    private int Edad;
    private boolean EnfermedadCronica;
    private double Peso;
    private double Estatura;

    public TestCovid() {
        Edad = 0;
        EnfermedadCronica = false;
        Peso = 0;
        Estatura = 0;
    }
    public int getEdad(){
        return Edad;
    }
    public boolean getEnfermedadCronica(){
        return EnfermedadCronica;
    }
    public double getPeso(){
        return Peso;
    }
    public double getEstatura(){
        return Estatura;
    }
    public void setEdad(int valor){
        Edad = valor;
    }
    public void setEnfermedadCronica(boolean valor){
        EnfermedadCronica = valor;
    }
    public void setPeso(double valor){
        Peso = valor;
    }
    public void setEstatura(double valor){
        Estatura = valor;
    }

    public String CalcularPersonaRiesgo () {
        calcularIMC imc = new calcularIMC();
        if (Edad >= 65 || EnfermedadCronica || imc.calcularIMC() > 30) {
            return "PERSONA DE RIESGO";
        }
        else{
            return "PERSONA SIN RIESGO";
        }
    }
    class calcularIMC {
        TestCovid dts = new TestCovid();
        private double calcularIMC(){
            return dts.Peso / dts.Estatura ;
        }
    }
}
