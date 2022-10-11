package main.java.homework.day2.cycletask;

import java.util.Random;

public class Massivrandom {

    private int[] array = new int[7];
    private Random randomy = new Random();

    public int[] returnNewMassiv() {

        for (int i = 0; i < array.length; i++) {
            array[i] = randomy.nextInt(100);
            //System.out.println(array[i] + " ");

        }
        return array;

        //    System.out.println();

        //    for (int i = array.length - 1; i >= 0; i--) {
        //        System.out.println(array[i] + " ");
        //    }

        //    System.out.println();

        //    for (int i = 0; i < array.length; i++) {
        //        System.out.println(array[i] * 5 + " ");
        //    }


    }

}
