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
public class Pregunta8A {
    
    int inicio = 2;
    boolean primo = true;
    
    public boolean esPrimo(int num) {
        
        if (num==2) {
            return true;
        }
              
        if (num%2==0){
            return false;
        }
        else
        {
            while ((primo) && (inicio != num)) {
                if (num % inicio == 0) {
                    primo = false;
                }
                inicio++;
            }
            return primo;
        }
    }  
}
