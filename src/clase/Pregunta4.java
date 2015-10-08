/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Pregunta4 {
    public static void main(String[] args) {
        
        int numero = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el numero");//sout
        numero = teclado.nextInt();

        
        if((numero%2)==0){
            System.out.println("Es par");  
        }
        else 
            System.out.println("Es impar");
    }
}
