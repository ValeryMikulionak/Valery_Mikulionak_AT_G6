package main.classwork.day2;

import java.util.Random;

public class Massiv {

    public void foo() {

        int[] array = new int[10];
        Random randomx = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = randomx.nextInt(100);
            System.out.println(array[i] + " ");
        }

        int sum = 0;
         for (int x : array) {
            sum = sum + x;
            //sum += x;
        }

        int av = sum / array.length;
            System.out.println("Average value is: " + av);
        }

}
