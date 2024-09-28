/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulorectangulo;
 /**
*Numero de control: 23550373
 * @author Alexis Cruz Martinez_
 * Materia: Estructura de datos 
 */
 public class Triangulorectangulo {

    public static void main(String[] args) {
        int altura = 5;  // Altura del triángulo
        imprimirTriangulo(altura);
    }

    // Método recursivo para imprimir el triángulo
    public static void imprimirTriangulo(int altura) {
        if (altura > 0) {
            imprimirTriangulo(altura - 1); // Llamada recursiva
            imprimirFila(altura);          // Imprime una fila con la cantidad de "*"
            System.out.println();          // Salto de línea después de cada fila
        }
    }

    // Método auxiliar que imprime una fila de 'n' asteriscos
    private static void imprimirFila(int n) {
        if (n > 0) {
            System.out.print("*");
            imprimirFila(n - 1); 
        }
    }
 }

