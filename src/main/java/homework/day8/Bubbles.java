package homework.day8;

import homework.day8.basa.Bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bubbles {

    public static void main(String[] args) {

        List<Bubble> bubbles = new ArrayList<>(Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO")));

        bubbles.stream().peek(x -> System.out.printf(x.getVolume() + " ")).collect(Collectors.toList());

//        for (Bubble b : bubbles){
//            System.out.printf(b.getVolume() + " ");
//        }
        System.out.println();

        bubbles.stream().peek(x -> System.out.printf(x.getName() + " ")).collect(Collectors.toList());

//        for (Bubble b : bubbles) {
//            System.out.printf(b.getName() + " ");
//        }
        System.out.println();

        System.out.println(bubbles.stream().mapToInt(x -> x.getVolume()).sum());

//        int sum = 0;
//        for (Bubble b : bubbles){
//            sum += b.getVolume();
//        }
//        System.out.println(sum);

        bubbles.stream().peek(x -> System.out.println(x)).collect(Collectors.toList());

//        for (int i = 0; i < bubbles.size(); i++) {
//            System.out.println(bubbles.get(i).toString());
//        }
    }
}
