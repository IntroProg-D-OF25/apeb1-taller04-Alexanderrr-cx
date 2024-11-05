import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        double consumoKilovatio, costoKilovatio, costoPlanilla, descuento;
        int edad; 
        Scanner teclado = new Scanner(System.in);
        // Bloque datos de entrada 
        System.out.print("Ingresar el costo por Kilovatio: ");
        costoKilovatio = teclado.nextDouble();
        System.out.print("Ingresar el consumo mensual por Kilovatio: ");
        consumoKilovatio = teclado.nextDouble();
        System.out.print("Ingresar su edad: ");
        edad = teclado.nextInt();
         // Bloque de procesamiento de datos de entrada 
        costoPlanilla = (costoKilovatio * consumoKilovatio);
        // Condicionales
        if (edad > 65){
            descuento = ((costoPlanilla * 10) / 100);
            costoPlanilla = (costoPlanilla - descuento);
            System.out.println("El valor a pagar es: " + costoPlanilla);
        } else {
        // Bloque de procesamiento de salida 
            System.out.printf("El valor a pagar es: "
                    + costoPlanilla);
        }
    }
}
/***
 * Ingresar el costo por Kilovatio: 25
*Ingresar el consumo mensual por Kilovatio: 100
*Ingresar su edad: 20
*El valor a pagar es: 2500.0BUILD SUCCESSFUL (total time: 12 seconds)
 */