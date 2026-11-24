package prog.sa4.classwork;

import java.util.Scanner;

/**
 *
 * @author empar
 */
public class Activitat14 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int num1, num2;

        System.out.print("Introdueix un número enter: ");
        num1 = teclat.nextInt();

        System.out.print("Introdueix un altre número enter: ");
        num2 = teclat.nextInt();
        
        String missatge = (num1 > num2) ? num1 + " és el major" : num2 + " és major o igual a " + num1;
    
        System.out.println(missatge);
        
        teclat.close();
    }
    
}
