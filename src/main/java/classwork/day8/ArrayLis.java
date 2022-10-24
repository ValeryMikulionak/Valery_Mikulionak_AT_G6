package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class ArrayLis {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        for (String str : names) {
            System.out.printf(str + " ");
        }

        System.out.println();

        names.set(2, "Оля");
        names.set(4, "Катя");

        for (int i = 0; i < names.size(); i++) {
            System.out.printf(names.get(i) + " ");
        }

        System.out.println();

        for (int i = 0; i < names.size(); i++) {
            names.remove("Оля");
        }

        names.remove(2);

        for (String str : names) {
            System.out.printf(str + " ");
        }

    }
}