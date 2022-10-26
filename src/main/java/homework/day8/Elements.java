package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Elements {

    public static void main(String[] args) {

        List<String> elements = new ArrayList<>();

        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String str : elements) {
            System.out.printf(str + " ");
        }
        System.out.println("");

        int counter = 0;
        for (String str : elements) {
            if (str.contains(" ") || str.contains("-")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < elements.size(); i++) {
            System.out.printf(elements.get(i) + " ");
        }
        System.out.println();

        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");

        for (String str : elements) {
            System.out.printf(str + " ");
        }
    }
}
