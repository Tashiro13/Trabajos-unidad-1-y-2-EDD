/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerocredecre;

import java.util.Scanner;

 /**
*Numero de control: 23550373
 * @author Alexis Cruz Martinez_
 * Materia: Estructura de datos 
 */
public class NumeroCreDecre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Introduzca un numero para saber si esta ordenado de manera creciente o decrecinete: ");
       int n = x.nextInt();
       //Saber si esta en orden crecinte o decreciente 
        if(ordenadoCrec(n)){
           System.out.println("Esta ordenado de manera creciente");
       } else{
           System.out.println("No esta ordenado de manera creciente");
             }
       
       if(ordenadoDecre(n)){
           System.out.println("Esta ordenado de manera decreciente");
       } else{
           System.out.println("No esta ordenado de manera decreciente");
             }
        }

    private static boolean ordenadoCrec(int n) {
        //Ejemplo 1234 -> true
       if(n<10){
           return true;
       } else {
           int numizq = n / potencia(10,digitos(n)-1);
            n = n -numizq * potencia(10, digitos(n)-1);
            int numder = n / potencia(10, digitos(n)-1);
            if(numizq <= numder){
                return ordenadoCrec(n);
            } else {
                return false;
            }
       }
    }
    private static boolean ordenadoDecre(int n) {
        //Ejemplo 4321 -> true
        if(n<10){
           return true;
       } else {
           int numizq = n / potencia(10,digitos(n)-1);
            n = n -numizq * potencia(10, digitos(n)-1);
            int numder = n / potencia(10, digitos(n)-1);
            if(numizq >= numder){
                return ordenadoDecre(n);
            } else {
                return false;
            }
       }
    }
    private static int potencia(int base, int exp) {
        if (exp == 0){
        return 1;
        }   else if (exp == 1) {
            return base;
        } else {
            return base * potencia(base, exp-1);
        }
    }
    private static int digitos(int n) {
        if (n==0){
            return 0;
        } else {
            return 1 + digitos(n/10);
        }
    }
    
}
