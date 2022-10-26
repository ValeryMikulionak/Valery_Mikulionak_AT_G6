package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class TEST {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");
        for (String i : butterflies) {
            System.out.println("\"" + i + "\"");
        }

        int counter = 0;
        for (String i : butterflies) {
            if (i.contains("o")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
        System.out.println("\n");
        for (String i : butterflies) {
            System.out.println(i);
        }
    }
}