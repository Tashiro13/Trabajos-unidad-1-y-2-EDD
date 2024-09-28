/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impresiondigitos;

/**
*Numero de control: 23550373
 * @author Alexis Cruz Martinez_
 * Materia: Estructura de datos 
 */
public class Impresiondigitos {

    /**
     * @param args the command line arguments
     */
    //Crea un metodo que imprima los digitos de 1 hasta N
    public static void main(String[] args) {
        //Declarar digitos 
        int n = 5;
       // incre(n);
        decre(n);
          System.out.println();
        
    }

    /*private static void incre(int n) {
        //Impreimir de uno a N
        //Ejemplo: n=5 - 12345
        if (n > 0){
            incre(n-1);
            System.out.print(n);
        }*/
    

    private static void decre(int n) {
if (n > 0){
      System.out.print(n);
        decre(n-1);
        }    
    }}