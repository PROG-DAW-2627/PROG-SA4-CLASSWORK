/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.sa4.classwork;

import java.util.Scanner;

/**
 *
 * @author empar
 */
public class Activitat36 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix 10 números enters:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = teclat.nextInt();

            // Si número és 0, finalitza el bucle
            if (numero == 0) {
                System.out.println("Has introduït 0. Programa finalitzat.");
                break;
            }
            if (numero == 100) { // Si número és 100, passa a la següent iteració
                continue;
            } 
            
            if (numero % 2 == 0) { // Comprova si es parell 
                System.out.println("\t" + numero + " és parell");
            } else { // imparell 
                System.out.println("\t" + numero + " és imparell");
            }
            
            if (numero % 5 == 0) { // comprova si és  múltiple de 5
                System.out.println("\t" + numero + " és múltiple de 5");
            }
        }

        teclat.close();
    }
   
}
