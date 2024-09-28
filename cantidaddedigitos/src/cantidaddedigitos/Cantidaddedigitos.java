/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cantidaddedigitos;

/*Numero de control: 23550373
 * @author Alexis Cruz Martinez_
 * Materia: Estructura de datos 
 */
public class Cantidaddedigitos {

    /**
     * @param args the command line arguments
     */
    //Crea un metodo que tenga la cantidad de digitos de un numero N.
    //Ejemplo: num = 45895 -> 5
    public static void main(String[] args) {
        int n = 3567281;
        System.out.println(n+" tiene " + digito(n)+" digitos");
    }

    private static int digito(int n) {
        if (n<=0){
            return 0;
        } else {
         return 1+digito(n/10);
        }
    }
    
}
