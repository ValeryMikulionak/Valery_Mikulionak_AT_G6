package cycletask;

import java.util.Random;

public class mas {

    public void returnNewMassiv() {

        int[] array = new int[7];
        Random randomy = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = randomy.nextInt(100);
            System.out.println(array[i] + " ");

        }

        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }
    }

}
