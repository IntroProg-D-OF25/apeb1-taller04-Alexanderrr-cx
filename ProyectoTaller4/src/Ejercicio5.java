import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        //BLOQUE DE DECLARACION DE VARIABLES
        double costo_cpu, costo_teclado, costo_monitor, costo_raton, valor_Total;
        Scanner Teclado = new Scanner (System.in);
        // Bloque datos de entrada 
        System.out.print("ingrese el costo del cpu:");
        costo_cpu = Teclado.nextDouble();
        System.out.print("ingrese el costo del teclado:");
        costo_teclado = Teclado.nextDouble();
        System.out.print("ingre el costo del monitor:");
        costo_monitor = Teclado.nextDouble();
        System.out.print("Ingrese el costo del raton:");
        costo_raton = Teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO
        valor_Total = costo_cpu + costo_monitor + costo_raton;
        //BLOQUE DE SALIDA
        System.out.println("el valor total de la compraes de: "+ valor_Total);
    }
}
/***
 * ingrese el costo del cpu:120
*ingrese el costo del teclado:15
*ingre el costo del monitor:60
*Ingrese el costo del raton:15
*el valor total de la compraes de: 195.0
 */