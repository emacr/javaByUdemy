package seccion10;

import java.util.Random;

public class ClaseRandom {
    public static void main(String[] args) {

        //objeto randon
        Random randon = new Random();

        int ri = randon.nextInt();

        System.out.println("ri = " + ri);

        //rango de 0 a n
        int rani = randon.nextInt(25);

        //rango de 5 a 10
        int ran = 5 + randon.nextInt(10-5);

        String [] paises = {"cr","canada","colombia","peru"};
        int pais = randon.nextInt(paises.length);
        System.out.println("pais = " + paises[pais]);










    }
}
