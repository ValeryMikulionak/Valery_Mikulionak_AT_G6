package clas;

import java.util.Random;

public class massivv {

    public void two() {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //for (int i = 0; i < 3; i++) {
            //for (int j = 0; j < 3; j++)
                //System.out.print(array[i][j]);

        for (int[] innerArray : array) {
            for (int x : innerArray) {
                System.out.print(x);
            }
        }

    }

}