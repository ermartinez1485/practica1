/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Pregunta6 {
    
    public static void main(String[] args) {
        
         int numero = 0;
         int annos =0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el numero");//sout
        numero = teclado.nextInt();

        
        if(numero>1998){
            System.out.println("Puede Votar");  
        }
        else
        {
            annos = 2015 - numero; 
            System.out.println("Aun no puede votar por que tiene" + annos);
        }
        

    }
    
}
