package homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Noodles {

    public static void main(String[] args) {

        List<String> noodles = new ArrayList<>();

        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        StringBuilder text = new StringBuilder();
        for (String str : noodles) {
            text.append(str).append("-");
        }
        System.out.println(text.substring(0, (text.length() - 1)));

        for (int i = 0; i < noodles.size(); i++) {
            noodles.set(i, noodles.get(i).replace("a", "o"));
        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.printf(noodles.get(i) + " ");
        }
    }
}