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
public class Activitat12ifelseifVersion {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.println("Quin tipus de rebuig necessites tirar? ");
        System.out.println("1. Plàstic ");
        System.out.println("2. Orgànic ");
        System.out.println("3. Paper ");
        System.out.println("4. Cartró ");
        System.out.println("5. Altre ");
        System.out.println("6. Només eco orgànica ");
        System.out.print("Tria una opció [1-6]: ");

        int opcio = teclat.nextInt();

        String contenidor;

        if (opcio == 1) {
            contenidor = "Groc";
        } else if (opcio == 2) {
            contenidor = "Gris";
        } else if (opcio == 3 || opcio == 4) {
            contenidor = "Blau";
        } else if (opcio == 5) {
            contenidor = "Verd";
        } else if (opcio == 6) {
            contenidor = "Marró";
        } else {
            contenidor = "Opció incorrecta";
        }

        if (opcio < 1 || opcio > 6) {
            System.out.println("Atenció: " + contenidor);
        } else {
            System.out.printf("Has de llençar-lo al contenidor: %s\n", contenidor);
        }

        // versió alternativa
        /*if (opcio >= 1 && opcio <= 6) {            
            System.out.printf("Has de llençar-lo al contenidor: %s\n", contenidor);
        } else {
            System.out.println("Atenció: " + contenidor);
        }*/
        
        teclat.close();
    }
}
