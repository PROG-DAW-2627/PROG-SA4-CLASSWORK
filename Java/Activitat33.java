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
public class Activitat33 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introdueix un número entre 1 i 10: ");
            numero = teclat.nextInt();
        } while (numero < 1 || numero > 10);

        System.out.println("Taula del " + numero);
        System.out.println("------------");
        
        // refactoritzem amb for
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }
        
        teclat.close();
    }
}
