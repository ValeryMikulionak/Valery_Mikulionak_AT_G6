package homework.day10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PersonRunner {

    public static String randomLetters() {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        int abcLength = abc.length();
        int a = 3;
        int b = 7;
        int randNumber = a + (int) (Math.random() * b);

        StringBuilder letters = new StringBuilder();

        for (int i = 0; i <= randNumber; i++) {
            int randLetter = (int) (Math.random() * abcLength);
            String buffer = abc.substring(randLetter, randLetter + 1);
            letters.append(buffer);
        }
        return letters.toString();
    }

    public static void main(String[] args) {

        Random randomNum = new Random();

        List<Person> str = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            str.add(new Person(randomLetters(), randomLetters(), 15 + randomNum.nextInt(16)));
        }

        str.stream().filter(x -> (x.age < 21))
                .peek(x -> System.out.println(x.name + " " + x.age)).
                sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName)).limit(4).peek(System.out::println).collect(Collectors.toList());

//        System.out.println(str.stream().filter(x -> (x.age < 21))
//                .peek(x -> System.out.println(x.name + " " + x.age)).
//                sorted(Comparator.comparing((Person y) -> y.surname).thenComparing((Person y) -> y.name)).limit(4).collect(Collectors.toList()));

    }
}

//        IntStream.rangeClosed(1, 100)
//                .boxed().map(i -> new Person(randomLetters(), randomLetters(), (int)(15+randomNum.nextInt(16))))
//                .collect(Collectors.toList()).forEach(System.out::println);
