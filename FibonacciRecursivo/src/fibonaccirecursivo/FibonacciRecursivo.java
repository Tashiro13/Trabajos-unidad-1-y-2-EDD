/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonaccirecursivo;

import java.util.Scanner;

/**
 * Numero de Control: 23550373
 * @author Alexis Cruz Martinez
 * Materia: Estructura de Datos
 */
public class FibonacciRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        // Pedir al usuario que ingrese el valor de n
        System.out.println("Ingrese el valor de n para calcular el número de Fibonacci: ");
        int n = t.nextInt();

        // Verificar que el valor de n sea no negativo
        if (n < 0) {
            System.out.println("El valor de n debe ser un entero no negativo.");
        } else {
            // Calcular el número de Fibonacci y mostrar el resultado
            long resultado = fibonacci(n);
            System.out.println("El número de Fibonacci en la posición " + n + " es: " + resultado);
        }
    }
    
    // Método recursivo para calcular el n-ésimo número de Fibonacci
    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
}