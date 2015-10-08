/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Estudiante
 */

//imprima en pnatalla los numeros del 5 al 50 de 5 en 5 utilizando for, while y do while
public class Pregunta2 {
    
    public static void main(String[] args) {
        
        
        int inicio = 5;
        
        
        while (inicio < 51) {
            System.out.println(inicio);
            inicio+=5;           
        }
        
        System.out.println("*******************************");
        //dowhile
        inicio = 5;
        do {
            
            
           System.out.println(inicio);
           inicio+=5;
           
        } while (inicio < 51);
        
        System.out.println("*******************************");
        
        for (int i = 5; i < 51; i+=5) {
            System.out.println(i);
     
        }
    }
    
}
