/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_1ra_evaluacion_honeycomb;

/**
 *
 * @author ricar
 */
public class EXAMEN_1RA_EVALUACION_HONEYCOMB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clases_examen.TestCovid perso = new clases_examen.TestCovid();
        
        perso.setEdad(18);
        perso.setEnfermedadCronica(false);
        perso.setEstatura(1.80);
        perso.setPeso(55);
        
        System.out.println("Edad: " + perso.getEdad());
        System.out.println("Peso: " + perso.getPeso());
        System.out.println("Estatura: " + perso.getEstatura());
        System.out.println("Tiene enfermedad cronica? " + perso.getEnfermedadCronica());
        System.out.println("Estado de riesgo por Covid: " + perso.CalcularPersonaRiesgo());
        
        clases_examen.CuentaBancaria cta = new clases_examen.CuentaBancaria("3043 9573 2013 1929", "Ricardo Alberto Miranda Jimenez", 2700);
        
        cta.depositarEnCuenta(600);
        cta.retirarDeCuenta(200);
        cta.imprimirDatos();
        
        clases_examen.Empleado empl = new clases_examen.Empleado("Rosa Maria", "Acosta Venegas", "Priv. de Leonardo Bravo", 2020, 2200);
        
        empl.imprimirDatos();
        
        clases_examen.DatosIntegrantes.imprimirDatosEquipo();
        clases_examen.DatosIntegrantes.imprimirProblemasResueltos();
    }
    
}
