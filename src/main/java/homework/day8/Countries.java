package homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Countries {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();

        countries.add("Андорра");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        StringBuilder text = new StringBuilder();
        for (String str : countries) {
            text.append(str).append(", ");
        }
        System.out.println(text.substring(0, (text.length() - 2)));
        System.out.println();

        int counter = 0;
        for (String str : countries) {
            if (str.length() < 7) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println();

        for (int i = 0; i < countries.size(); i++) {
            System.out.printf(countries.get(i) + "\n");
        }
    }
}