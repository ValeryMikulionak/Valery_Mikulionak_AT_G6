package homework.day8;

import homework.day8.basa.Bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bubbles {

    public static void main(String[] args) {

        List<Bubble> bubbles = new ArrayList<>(Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO")));

        for (Bubble b : bubbles){
            System.out.printf(b.getVolume() + " ");
        }
        System.out.println();

        for (Bubble b : bubbles) {
            System.out.printf(b.getName() + " ");
        }
        System.out.println();

        int sum = 0;
        for (Bubble b : bubbles){
            sum += b.getVolume();
        }
        System.out.println(sum);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
