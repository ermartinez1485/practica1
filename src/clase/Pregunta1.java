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

//Imprima en pantalla los numeros del 3 al 33 utilizando for, while and do while
public class Pregunta1 {
    
    public static void main(String[] args) {
        
        int inicio = 3;
        
        
        while (inicio < 34) {
            System.out.println(inicio);
            inicio++;           
        }
        
        System.out.println("*******************************");
        //dowhile
        inicio = 3;
        do {
            
            
           System.out.println(inicio);
           inicio++;
           
        } while (inicio < 34);
        
        System.out.println("*******************************");
        
        for (int i = 0; i < 34; i++) {
            System.out.println(i);
     
        }
        
    }
    
    
}
