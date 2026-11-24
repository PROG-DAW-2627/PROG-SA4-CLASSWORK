package prog.sa4.classwork;

import java.util.Random;

/**
 *
 * @author empar
 */
public class Activitat37 {

    static final int NUM_LLANCAMENTS = 1000000;

    public static void main(String[] args) {
        // Contadores para caras y cruces
        int cares = 0;
        int creus = 0;

        Random random = new Random();

        // Simulem 1.000.000 de llançaments
        for (int i = 1; i <= NUM_LLANCAMENTS; i++) {

            // Generem número aleatori entre 1 y 2
            
            int llancament = random.nextInt(1, 3);
            // Alternativa amb Math.random()
            // int llancament = (int)(Math.random() * 2 + 1);

            // contem
            if (llancament == 1) {
                cares++;
            } else {
                creus++;
            }
        }

        // Mostramos los resultados
        System.out.printf("Resultats després de %,d llançaments:\n", NUM_LLANCAMENTS);
        System.out.println("----------------------------------------------");
        System.out.println("Nombre de cares: " + cares);
        System.out.println("Nombre de creus: " + creus);
        
        // Opcional, mostrem percentatges
        double percentatgeCares = (cares * 100.0) / NUM_LLANCAMENTS;
        double percentatgeCreus = (creus * 100.0) / NUM_LLANCAMENTS;
        System.out.printf("Percentatge cares: %.2f%%\n", percentatgeCares);
        System.out.printf("Percentatge creus: %.2f%%\n", percentatgeCreus);
    }
}
