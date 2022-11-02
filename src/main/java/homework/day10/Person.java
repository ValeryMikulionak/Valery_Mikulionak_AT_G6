package homework.day10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Person {

    public String name;
    public String surname;
    public int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

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
//                sorted(Comparator.comparing(y -> y.surname).thenComparing(y -> y.name).collect(Collectors.toList())));

//        IntStream.rangeClosed(1, 100)
//                .boxed().map(i -> new Person(randomLetters(), randomLetters(), (int)(15+randomNum.nextInt(16))))
//                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
