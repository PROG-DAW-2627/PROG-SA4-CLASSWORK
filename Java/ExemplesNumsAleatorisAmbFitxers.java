/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.sa4.classwork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

/**
 *
 * @author empar
 */
public class ExemplesNumsAleatorisAmbFitxers {

    public static void main(String[] args) throws InterruptedException, IOException {

        // exemples
        /*
        double x = Math.random();

        System.out.println(x);

        // 1..10
        System.out.println((int) (Math.random() * 10 + 1));

        // min=5, max=20 ---> random() * (max-min+1) + min
        System.out.println((int) (Math.random() * (20 - 5 + 1) + 5));
        */
        
        Random random = new Random();

        // genere i guarde a un fitxer 5 nums aleatoris entre 100 y 250
        Path fitxerAleatoris = Path.of("aleatoris.txt");

        BufferedWriter bw = Files.newBufferedWriter(fitxerAleatoris);

        for (int i = 1; i <= 5; i++) {
            int num = random.nextInt(100, 251);
            bw.write(String.valueOf(num));
            bw.newLine();
        }
        bw.close();

        BufferedReader br = Files.newBufferedReader(fitxerAleatoris);

        String linia = br.readLine();
        while (linia != null) {
            System.out.println(linia);
            linia = br.readLine();
        }
        br.close();

    }
}
