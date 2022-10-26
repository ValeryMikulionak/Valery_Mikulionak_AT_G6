package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birds {

    public static void main(String[] args) {

        List<String> birds = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));

        for (String str : birds) {
            System.out.println("--" + str + "--");
        }

        int count = 0;
        for (String str : birds) {
            String[] s = str.split("");
            int counter = 0;
            for (int i = 0; i < str.length(); i++) {
                if (s[i].toLowerCase().matches("[аеёиоуыэюя]")) {
                    counter++;
                }
            }
            if (counter > 1) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < birds.size(); i++) {
            System.out.printf(birds.get(i) + " ");
        }
        System.out.println("\n");

        birds.set(3, "Синица");
        for (String str : birds) {
            System.out.println(str + " ");
        }
    }
}
