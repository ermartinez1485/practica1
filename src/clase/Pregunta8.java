/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Pregunta8 {

    public static void main(String[] args) {
        
        Pregunta8A preA = new Pregunta8A();
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el numero");//sout
        numero = teclado.nextInt();
        
        if (preA.esPrimo(numero)==true) {
            System.out.println("Es Primo");
        }
        else{
            
            System.out.println("No es Primo");          
        }
    }
}
