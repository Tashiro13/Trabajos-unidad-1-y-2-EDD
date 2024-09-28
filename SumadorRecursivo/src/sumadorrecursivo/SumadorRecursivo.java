/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumadorrecursivo;

import java.util.Scanner;
/**
 * Numero de Control: 23550373
 * @author Alexis cruz Martinez
 * Materia: Estructura de Datos
 */

public class SumadorRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);

        // Pedir al usuario que ingrese el valor de n
        System.out.print("Ingrese el valor de n: ");
        int n = t.nextInt();
        
        long resultado = sumaNenteros(n);
        System.out.println("La suma de los primeros " + n + " enteros es: " + resultado);
    }

    private static long sumaNenteros(int n) {
       if (n == 1) return 1;
        else return n + sumaNenteros(n - 1);
    }
    
}
