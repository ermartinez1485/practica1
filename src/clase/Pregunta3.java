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
//imprima en pantalla los numeros del 100 al 50 de 10 en 10 utilizando for while do while
public class Pregunta3 {
    
    public static void main(String[] args) {
        
        int inicio = 10;
        
        while (inicio < 101) {
            System.out.println(inicio);
            inicio+=10;           
        }
        
        System.out.println("*******************************");
        //dowhile
        inicio = 10;
        do {
            
            
           System.out.println(inicio);
           inicio+=10;
           
        } while (inicio < 101);
        
        System.out.println("*******************************");
        
        for (int i = 10; i < 101; i+=10) {
            System.out.println(i);
     
        }
    }
    
}
