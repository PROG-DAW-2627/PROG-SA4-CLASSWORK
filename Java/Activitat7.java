package prog.sa4.classwork;

import java.util.Scanner;

public class Activitat7 {

    private static final int MAJOR_EDAT = 18;

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix edat persona: ");
        int edat = teclat.nextInt();

        teclat.close();

        if (edat >= MAJOR_EDAT) {
            System.out.println("És major d'edat");
        } else {
            System.out.println("És menor d'edat");
            System.out.println("per 'else'");
        }

    }

}
