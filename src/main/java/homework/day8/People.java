package homework.day8;

import homework.day8.basa.Person;

import java.util.ArrayList;
import java.util.List;

public class People {

    public static void main(String[] args) {

        List<Person> peoples = new ArrayList<>();

        peoples.add(new Person(32, "Коля"));
        peoples.add(new Person(24, "Оля"));
        peoples.add(new Person(55, "Вася"));
        peoples.add(new Person(63, "Маша"));

        for (Person p : peoples) {
            System.out.printf(p.getAge() + " ");
        }
        System.out.println();

        for (Person p : peoples) {
            System.out.printf(p.getName() + " ");
        }
        System.out.println();

        for (int i = 0; i < peoples.size(); i++) {
            System.out.println(peoples.get(i).toString());
        }
    }
}
