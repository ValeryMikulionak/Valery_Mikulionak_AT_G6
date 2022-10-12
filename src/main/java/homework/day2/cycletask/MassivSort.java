package homework.day2.cycletask;

import java.util.Arrays;

public class MassivSort {

    public void massivSort(int[] array) {

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

    }

}
