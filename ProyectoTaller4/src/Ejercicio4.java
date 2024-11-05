import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        // Bloque declaracion de variables -> Datos de Entrada y Salida
        double costoMinutos, numMinConsumidos, valorPlanilla; 
        Scanner teclado = new Scanner(System.in);
        // Bloque datos de entrada 
        System.out.print("Ingrese el costo de llamada por minuto: ");
        costoMinutos = teclado.nextDouble(); 
        System.out.print("Ingrese el numero de minutos consumidos al mes: ");
        numMinConsumidos = teclado.nextDouble(); 
        // Bloque de procesamiento de valores de entrada  
        valorPlanilla = (costoMinutos * numMinConsumidos); 
        // Bloque de salida 
        System.out.println("Los gastos de planilla de telefono al mes es: "
                + valorPlanilla);
    }
    
}
/***
 * Ingrese el costo de llamada por minuto: 7
*Ingrese el numero de minutos consumidos al mes: 9
*Los gastos de planilla de telefono al mes es: 63.0
*BUILD SUCCESSFUL (total time: 9 seconds)
 */