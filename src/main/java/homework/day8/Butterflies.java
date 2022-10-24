package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {

    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String str : butterflies) {
            System.out.println("\"" + str + "\"");
        }
        System.out.println();

        int counter = 0;
        for (String str : butterflies) {
            if (str.contains("o")) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println();

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.printf(butterflies.get(i) + " ");
        }
        System.out.println("\n");

        for (String str : butterflies) {
            System.out.printf(str + "\n");
        }
    }
}
