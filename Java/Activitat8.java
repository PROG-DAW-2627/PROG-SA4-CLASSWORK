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
public class Activitat8 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix un número: ");
        int num = teclat.nextInt();
        teclat.close();
        // 0000013
        if (num == 0) {
            System.out.println("És zero");
        } else {
        
            if (num % 2 == 0) {
                System.out.printf("%07d és parell \n", num);
            } else {
                System.out.printf("%07d és imparell (senar) \n", num);
            }

            if (num > 0) {
                System.out.println("Positiu");
            } else {
                System.out.println("Negatiu");
            }
        }
    }

}
