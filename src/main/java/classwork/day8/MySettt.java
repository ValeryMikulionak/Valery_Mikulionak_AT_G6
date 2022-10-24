package classwork.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySettt {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        String[] array = "мама мыла раму мыла".split(" ");

        for (String str : array) {
            mySet.add(str);
        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String str : mySet) {
            System.out.println(str);
        }
    }
}