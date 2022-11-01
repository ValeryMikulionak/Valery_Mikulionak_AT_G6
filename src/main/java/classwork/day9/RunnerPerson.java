package classwork.day9;

import java.util.Arrays;
import java.util.List;

public class RunnerPerson {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        int counter = 0;
        for (Person p : people) {
            if ((p.sex == Person.Sex.WOMEN && (p.age >= 18 && p.age <= 55)) ||
                    (p.sex == Person.Sex.MAN && (p.age >= 18 && p.age <= 60))) {
                counter++;
            }
        }
        System.out.println(counter);

        long x = people.stream().filter(w -> w.sex == Person.Sex.WOMEN && (w.age >= 18 && w.age <= 55) ||
                (w.sex == Person.Sex.MAN && (w.age >= 18 && w.age <= 60))).count();
        System.out.println(x);

    }
}
