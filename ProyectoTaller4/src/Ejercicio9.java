import java.util.Scanner; 
public class Ejercicio9 {
    public static void main(String[] args) {
        // Declaracion de variables
        double areatriagRectangulo, areaCuadrado, areaRectangulo, areaTotal;
        Scanner teclado = new Scanner(System.in); 
         // Base de datos de entrada 
        System.out.print("Ingrese valores para la base del cuadrado: "); 
        areaCuadrado = teclado.nextDouble();
        System.out.print("Ingrese valores para la altura del rectangulo: "); 
        areaRectangulo = teclado.nextDouble();
        // Bloque de procesamiento de datos de entrada
        areatriagRectangulo = ((areaCuadrado * areaRectangulo)* 3); 
        areaCuadrado = (areaCuadrado * areaCuadrado); 
        areaRectangulo = (areaCuadrado * areaRectangulo); 
        areaTotal = (areatriagRectangulo + areaCuadrado + areaRectangulo); 
         // Bloque de salida
        System.out.println("El area total es: " + areaTotal);
    }
}
/***
 * 
 */