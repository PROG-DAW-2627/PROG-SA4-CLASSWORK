/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.sa4.classwork;

/**
 *
 * @author empar
 */
public class Activitat29 {

    static final int VALOR_INICIAL = 1;
    static final int VALOR_FINAL = 1000;

    public static void main(String[] args) {
        int comptador = VALOR_INICIAL;
        int suma = 0;

        while (comptador <= VALOR_FINAL) {
            System.out.print(comptador);
            
            if (comptador < VALOR_FINAL) {
                System.out.print(" + ");
            }
            
            suma += comptador;
            
            comptador++;
            
        }
        System.out.println(" = " + suma);

    }
}
