package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubles {

    public static void main(String[] args) {

        List<Double> doublesChisla = new ArrayList<Double>(Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9));

        for (double d : doublesChisla) {
            System.out.printf(d + " ");
        }
        System.out.println();

        double sum = 1;
        for (double d : doublesChisla) {
            sum = (sum * d);
        }
        System.out.println(sum);

        double sum1 = 0;
        for (double d : doublesChisla) {
            double part = d % 1;
            sum1 += part;
        }
        System.out.println(sum1);

        for (int i = 0; i < doublesChisla.size(); i++) {
            System.out.printf(doublesChisla.get(i).intValue() + " ");
        }
    }
}
