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
public class Pregunta7 {
    
    public static void main(String[] args) {

        int numero = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite Numero");
        numero = teclado.nextInt();

        if (numero == 1) {
            System.out.println("Mes Enero");
        } else {
            if (numero == 2) {
                System.out.println("Mes Febrero");
            } else {
                if (numero == 3) {
                    System.out.println("Mes marzo");
                } else {
                    if (numero == 4) {
                        System.out.println("Mes abril");
                    } else {
                        if (numero == 5) {
                            System.out.println("Mes mayo");
                        } else {
                            if (numero == 6) {
                                System.out.println("Mes junio");
                            } else {
                                if (numero == 7) {
                                    System.out.println("Mes julio");
                                } else {
                                    if (numero == 8) {
                                        System.out.println("Mes agosto");
                                    } else {
                                        if (numero == 9) {
                                            System.out.println("Mes setiembre");
                                        } else {
                                            if (numero == 10) {
                                                System.out.println("Mes octubre");
                                            } else {
                                                if (numero == 11) {
                                                    System.out.println("Mes noviembre");
                                                } else {
                                                    if (numero == 12) {
                                                        System.out.println("Mes diciembre");
                                                    }

                                                }

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
}
