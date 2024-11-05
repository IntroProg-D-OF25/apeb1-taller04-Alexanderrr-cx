import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        //BLOQUE DECLARACION DE VARIABLES -> DATOS DE ENTRADA Y SALIDA
        double baseTriag, altoTriang, areaTriang;
        Scanner teclado = new Scanner(System.in); 
        //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA
        System.out.println("DAME LA BASE DEL T. :");
        baseTriag = teclado.nextDouble();
        System.out.println("DAME LA ALTURA DEL T. :");
        altoTriang = teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA LEIDOS
        areaTriang = (baseTriag * altoTriang) / 2;
        //BLOQUE DE SALIDA DE RESULTADOS
        System.out.println("AREA DEL T. = " + areaTriang);
    }
 
}
/***
 * DAME LA BASE DEL T. :
*4
*DAME LA ALTURA DEL T. :
*8
*AREA DEL T. = 16.0
*BUILD SUCCESSFUL (total time: 13 seconds)
 */