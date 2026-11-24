package ud4.classwork;

import java.util.Scanner;

/**
 *
 * @author empar
 */
public class Activitat11 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix una qualificació entre 0 i 10: ");

        short qualificacio = teclat.nextShort();
        teclat.close();

        String notaTextual;

        switch (qualificacio) {
            case 0, 1, 2 ->
                notaTextual = "MOLT DEFICIENT";
            case 3, 4 ->
                notaTextual = "INSUFICIENT";
            case 5 ->
                notaTextual = "SUFICIENT";
            case 6 ->
                notaTextual = "BÉ";
            case 7, 8 ->
                notaTextual = "NOTABLE";
            case 9, 10 ->
                notaTextual = "EXCEL·LENT";
            default -> {   // si només hi ha 1 instrucció, no hi calen {}
                notaTextual = "NOTA INTRODUÏDA INVÀLIDA, NOMÉS:[0-10]";                  
            }            
        }

        System.out.println(notaTextual);
    }
}
