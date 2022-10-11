package homework.day2.cycletask;

import java.util.Random;

public class MassivRandom {

    private int[] array = new int[7];
    private Random randomy = new Random();

    public int[] returnNewMassiv() {

        for (int i = 0; i < array.length; i++) {
            array[i] = randomy.nextInt(100);
            int j = array[i];

        }
        return array;

    }

}
