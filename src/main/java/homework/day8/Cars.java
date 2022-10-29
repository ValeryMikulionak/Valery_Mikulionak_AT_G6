package homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cars {

    public static void main(String[] args) throws IOException {

        List<String> cars = new ArrayList<>();

        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        BufferedWriter out = new BufferedWriter(new FileWriter("cars.txt"));
        for (String str : cars) {
            out.write("\"" + str + "\"" + "\n");
        }
        out.close();

        List<String> carsNew = new ArrayList<>();
        for (String str : cars) {
            if (str.length() <= 4) {
                carsNew.add(str);
            }
        }
        for (String str : carsNew) {
            System.out.printf(str + " ");
        }
    }
}

