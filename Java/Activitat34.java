/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.sa4.classwork;

/**
 *
 * @author empar
 */
public class Activitat34 {
    public static void main(String[] args) {
        int quantitatParells = 0;
        int quantitatImparellsMult5 = 0;
        
        for (int i = 1; i <= 100; i++) {            
            if (i % 2 == 0) {
                System.out.print(i + " ");
                quantitatParells++;
            } else if (i % 5 == 0 ) {
                quantitatImparellsMult5++;
                
            } 
        }    
        System.out.println("\n\nQuantitat números parells: " + quantitatParells);
        System.out.println("Quantitat de números imparells i múltiples de 5: " + quantitatImparellsMult5);
    }
}
