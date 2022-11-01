package classwork.day9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NewList2 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        System.out.println(list.stream().sorted((y,x) -> x.compareTo(y)).distinct().collect(Collectors.toList()));

        List<Person> people = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        people.stream().sorted((p1, p2) -> {
            if (p1.sex != p2.sex) {
                return p1.sex.compareTo(p2.sex);
            } else {
                return p1.age - p2.age;
            }
        }).peek(x -> System.out.println(x.name)).collect(Collectors.toList());

        String s = list.stream().flatMap(x -> Arrays.stream(x.split(""))).
                peek(x -> System.out.printf(x+" ")).max(String::compareTo).get();
        System.out.println(s);

        System.out.println(people.stream().min(Comparator.comparingInt(p -> p.age)).get());


        System.out.println(list.stream().flatMap(x -> Arrays.stream(x.split(""))).count());

        System.out.println(list.stream().mapToInt(x -> {
            if (x.length() % 2 != 0) {
                return x.length();
            }
            return 0;
        }).sum());

        System.out.println(list.stream().mapToInt(x -> x.length() % 2 != 0 ? x.length() : 0).sum());

        System.out.println(list.stream().collect(Collectors.joining(":", "<p>", "</p>")));
        System.out.println(people.stream().collect(Collectors.toMap(x -> x.hashCode(), x ->x)));
        System.out.println(people.stream().collect(Collectors.groupingBy(x -> x.sex)).keySet());

    }
}
