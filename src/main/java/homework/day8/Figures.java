package homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Figures {

    public static void main(String[] args) throws IOException {

        List<String> figures = new ArrayList<>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));

        StringBuilder text = new StringBuilder();
        for (String str : figures) {
            text.append(str).append("-");
        }
        BufferedWriter out = new BufferedWriter(new FileWriter("figures.txt"));
        out.write(text.substring(0, (text.length() - 1)));
        out.close();

        int counter = 0;
        for (String str : figures) {
            if (!str.contains("и")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < figures.size(); i++) {
            System.out.printf(figures.get(i) + " ");
        }
        System.out.println();
        figures.add(3, "Треугольник");
        for (String str : figures) {
            System.out.printf(str + " ");
        }
    }
}