/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.sa4.classwork;

/**
 *
 * @author empar
 */
public class Activitat28 {

    public static void main(String[] args) {
        int comptador = 48;

        while (comptador <= 100) {
            System.out.print(comptador);

            if (comptador < 100) {
                System.out.print(", ");
            }

            comptador += 2;
        }
    }

}
