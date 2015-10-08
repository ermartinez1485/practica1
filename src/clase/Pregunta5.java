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
public class Pregunta5 {

    public static void main(String[] args) {

        char Operador = ' ';

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el Operador");//sout
        Operador = teclado.nextLine().charAt(0);

        switch (Operador) {
            case '+':
                System.out.println("El Operador es Suma");

                break;
            case '/':
                System.out.println("El Operador es Divicion");

                break;
            case '%':
                System.out.println("El Operador es Porcentaje");

                break;
            case '-':
                System.out.println("El Operador es ");

                break;

            default:
                System.out.println("Caracter Desconocido");
        }
    }

}
