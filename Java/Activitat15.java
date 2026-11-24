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
public class Activitat15 {

    static final double QUOTA_GENERAL = 500.0;
    static final double DESCOMPTE_MAJORS_65 = 0.45;
    static final double DESCOMPTE_MENORS_18 = 0.25;

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix el nom: ");
        String nom = teclat.nextLine();

        System.out.print("Introdueix l'edat: ");
        int edat = teclat.nextInt();

        teclat.close();

        double quota = 0.0;

        if (edat <= 0) {
            System.out.println("L'edat introduïda no és correcta.");
        } else if (edat >= 65) {
            quota = QUOTA_GENERAL - QUOTA_GENERAL * DESCOMPTE_MAJORS_65;
        } else if (edat < 18) {
            quota = QUOTA_GENERAL - QUOTA_GENERAL * DESCOMPTE_MENORS_18;
        } else {
            quota = QUOTA_GENERAL;
        }

        System.out.printf("%s, has de pagar %.1f\n", nom, quota);
        
        /*
        double quota2 = (edat > 65) 
                ? QUOTA_GENERAL - QUOTA_GENERAL * DESCOMPTE_MAJORS_65
                : 
                    (edat <18) 
                        ? QUOTA_GENERAL - QUOTA_GENERAL * DESCOMPTE_MENORS_18 
                        : QUOTA_GENERAL
                ;
        */
        
    }

}
