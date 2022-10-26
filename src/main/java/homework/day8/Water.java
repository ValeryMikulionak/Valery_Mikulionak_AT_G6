package homework.day8;

import homework.day8.basa.Bubble;
import homework.day8.basa.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Water {

    public static void main(String[] args) {

        List<homework.day8.basa.Water> water = new ArrayList<>(Arrays.asList(new homework.day8.basa.Water("Прозрачная", "Нет"),
                new homework.day8.basa.Water("Прозрачная", "Нет"), new homework.day8.basa.Water("Мутная", "Аммиачный")));

        for (homework.day8.basa.Water w : water) {
            System.out.println(w.getColor() + "-" + w.getSmell());
        }
    }
}
