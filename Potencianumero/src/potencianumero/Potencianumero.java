/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potencianumero;

/*Numero de control: 23550373
 * @author Alexis Cruz Martinez_
 * Materia: Estructura de datos 
 */
//Crear un metodo que obtenga el resultado de elevar un numero a otro
public class Potencianumero {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
           int base = 2;
           int exp = 2;
           
           System.out.println(base +" elevado a " + exp + " = " + potencia(base,exp));
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
    
}
