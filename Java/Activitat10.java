package prog.sa4.classwork;

import java.util.Scanner;

/**
 *
 * @author empar
 */
public class Activitat10 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix una qualificació entre 0 i 10: ");

        short qualificacio = teclat.nextShort();
        teclat.close();

        String notaTextual;

        switch (qualificacio) {
            case 0, 1, 2:
                notaTextual = "MOLT DEFICIENT";
                break;
            case 3:
            case 4:
                notaTextual = "INSUFICIENT";
                break;
            case 5:
                notaTextual = "SUFICIENT";
                break;
            case 6:
                notaTextual = "BÉ";
                break;
            case 7:
            case 8:
                notaTextual = "NOTABLE";
                break;
            case 9:
            case 10:
                notaTextual = "EXCEL·LENT";
                break;
            default:
                notaTextual = "NOTA INTRODUÏDA INVÀLIDA, NOMÉS:[0-10]";
                break;
        }

        System.out.println(notaTextual);
    }
}
