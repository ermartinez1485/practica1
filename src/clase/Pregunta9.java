/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase;

/**
 *
 * @author Eric Martinez
 */

/*

Genere un número aleatorio del 0 al 15 y muestre el resultado de la suma de todos los números
anteriores a este. Ejemplo el número aleatorio fue el 4, entonces se debe mostrar 10 (1+2+3+4)
*/
public class Pregunta9 {
    
    
    /*
    
    Para obtener un número entero entre dos valores DESDE , HASTA, ambos incluidos, debemos usar la fórmula:
    (int)(Math.random()*(HASTA-DESDE+1)+DESDE); 
    Por ejemplo, para generar 5 números enteros al azar entre 8 y 15:
    for(int i = 1; i<=5; i++)
     System.out.println((int)(Math.random()*(15-8+1)+8));
    
    */
    
    public static void main(String[] args) {
        
        //(int)(Math.random()*(HASTA-DESDE+1)+DESDE); 
        int numeroRandom = (int)(Math.random()*(15-0)+0);
        int contador=0;
        System.out.println("numeroRandom: "+numeroRandom);
        //System.out.println((int)(Math.random()*(15-0)+0));
        while (numeroRandom!=0) {
            
            contador +=numeroRandom;
            numeroRandom--;
        }
        
        System.out.println("La suma de los numeros es "+contador);        
    }
}
