/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.sa4.classwork;
/**
 *
 * @author empar
 */
public class ExempleForAnidatsMostrarHora {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    System.out.printf(" %02d h %02d min %02d seg", i, j, k);
                    System.out.print("\r");
                    Thread.sleep(1000);
                }
            }
        }
    }
}