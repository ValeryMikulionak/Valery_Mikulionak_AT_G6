package classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NewList1 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().anyMatch((x -> x.equals("мама"))));
        System.out.println(list.stream().allMatch((x -> x.contains("м"))));
        System.out.println(list.stream().map(x -> x.concat("м")).collect(Collectors.toList()));
        System.out.println(list.stream().flatMap(x -> Arrays.stream(x.split("а"))).
                filter((x -> !x.isEmpty())).collect(Collectors.toList()));

    }
}
