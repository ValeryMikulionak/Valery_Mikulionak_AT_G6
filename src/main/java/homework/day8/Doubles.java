package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubles {

    public static void main(String[] args) {

        List<Double> doublesChisla = new ArrayList<Double>(Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9));

        for (Double d : doublesChisla) {
            System.out.printf(d + " ");
        }
        System.out.println();

        double sum = 1;
        for (Double d : doublesChisla) {
            sum = (sum * d);
        }
        System.out.println(sum);


    }
}
