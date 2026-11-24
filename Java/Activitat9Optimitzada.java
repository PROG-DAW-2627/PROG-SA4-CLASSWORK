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
public class Activitat9Optimitzada {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix una qualificació (entre 0 i 10): ");
        double nota = teclat.nextDouble();
        
        if (nota < 0 || nota > 10) {
            System.out.println("La nota introduïda és invàlida.");
        } else if (nota < 3) {
            System.out.println("MOLT DEFICIENT");
        } else if (nota < 5) {
            System.out.println("INSUFICIENT");
        } else if (nota < 6) {
            System.out.println("SUFICIENT");
        } else if (nota < 7) {
            System.out.println("BÉ");
        } else if (nota < 9) {
            System.out.println("NOTABLE");
        } else if (nota <= 10) {
            System.out.println("EXCEL.LENT");
        }
        teclat.close();
    }

}
