package clase;

import java.util.Scanner;

/**
 *
 * @author Eric Martinez
 * 
    10. Ingresar n números por teclado e imprima por pantalla el promedio de estos.
 * 
 * 
 */
public class Pregunta10 {
    
    public static void main(String[] args) {
        
        int numero =0;
        int cantidad =0;
        int promedio=0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de numeros a promediar");
        cantidad = teclado.nextInt();
        
        int[] numeros;
        numeros = new int[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            
            System.out.println("Digite el numero");
            numero = teclado.nextInt();
            numeros[i]=numero;           
        }
        
        for (int i = 0; i < numeros.length; i++) {
            promedio += numeros[i];
        }
        
        promedio /= numeros.length;
        
        System.out.println("El promedio es de " + promedio);
    }
}
