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
public class Activitat16 {
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
        
        if (!teclat.hasNextInt()){
            System.out.println("Has d'introduir un número enter");
            System.exit(0);
        }
        
        int opcio = teclat.nextInt();
        
        String contenidor;
        
        switch (opcio) {
            case 1 -> contenidor = "Groc";
            case 2 -> contenidor = "Gris";
            case 3, 4 -> contenidor = "Blau";
            case 5 -> contenidor = "Verd";
            case 6 -> contenidor = "Marró";
            default -> contenidor = "Opció incorrecta";
        }
        System.out.printf("Has de llençar-lo al contenidor: %s\n", contenidor);
             
        teclat.close();
    }
}
