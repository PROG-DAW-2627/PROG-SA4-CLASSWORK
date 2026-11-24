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
public class Activitat30 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introdueix un número: ");
            numero = teclat.nextInt();
            if (numero != 10) {
                System.out.println(numero);
            }

        } while (numero != 10);

        teclat.close();
    }

}
