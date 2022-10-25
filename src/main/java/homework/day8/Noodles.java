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

        StringBuilder Text = new StringBuilder();
        for (String str : noodles) {
            Text.append(str).append("-");
        }
        System.out.println(Text.substring(0, (Text.length() - 1)));
        System.out.println();

        for (String str : noodles) {
            String[] s = str.split("");
            for (int i = 0; i < str.length(); i++) {
                if (s[i].toLowerCase().matches("a")) {
                    s[i] = "o";
                }
            }
            for (int i = 0; i < noodles.size(); i++) {
                System.out.printf(noodles.get(i) + " ");
            }

        }
    }
}
