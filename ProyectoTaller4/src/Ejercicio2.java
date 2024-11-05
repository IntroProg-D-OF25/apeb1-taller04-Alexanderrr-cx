import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        //BLOQUE DE DECLARACION DE VARIABLES 
        double gastoHijo1, gastoHijo2, gastoHijo3, totalGastos;
        Scanner teclado =  new Scanner(System.in);
        //BLOQUE DE LECTURA DE DATOS DE ENTRADA
        System.out.println("DAME GASTOS DEL H1:");
        gastoHijo1 = teclado.nextDouble();
        System.out.println("DAME GASTOS DEL H2:");
        gastoHijo2 = teclado.nextDouble();
        System.out.println("DAME GASTOS DEL H3");
        gastoHijo3 = teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO
        totalGastos = gastoHijo1 + gastoHijo2 + gastoHijo3;
        //BLOQUE DE SALIDA DE RESULTADOS 
        System.out.println("GASTOS TOTALES: " + totalGastos);
    }
}
/***
 * DAME GASTOS DEL H1:
*8
*DAME GASTOS DEL H2:
*6
*DAME GASTOS DEL H3
*3
*GASTOS TOTALES: 17.0
*BUILD SUCCESSFUL (total time: 11 seconds)
 */