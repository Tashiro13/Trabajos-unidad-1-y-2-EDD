/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplorendimiento;

/**
 * Numero de Control: 23550373
 * @author Alexis Cruz Martinez
 * Materia: Estructura de Datos
 */
public class EjemploRendimiento {

        public static void main(String[] args) {
     
        float[][] matriz = {
            {1.0f, 2.0f, 3.0f},
            {4.0f, 5.0f, 6.0f},
            {7.0f, 8.0f, 9.0f}
        };   
        
         // Imprimir la matriz original
        System.out.println("Matriz Original:");
        imprimirMatriz(matriz);

        // Calcular la transpuesta
        traspuesta(matriz, matriz.length);

        // Imprimir la matriz transpuesta
        System.out.println("Matriz Transpuesta:");
        imprimirMatriz(matriz);
}
        
    static void traspuesta(float[][] d, int n){
        int i, j;
            for (i = n - 2; i > 0; i--) {
                for (j = i + 1; j < n; j++) {
                    float t;
                    t = d[i][j];
                    d[i][j] = d[j][i];
                    d[j][i] = t;
                }
            }
        }
    
    static void imprimirMatriz(float[][] matriz) {
        for (float[] fila : matriz) {
            for (float elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}