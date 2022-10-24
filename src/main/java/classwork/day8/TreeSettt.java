package classwork.day8;

import java.util.*;

public class TreeSettt {

    public static void main(String[] args) {

        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        Iterator<String> iterator1 = myList1.iterator();
        Iterator<String> iterator2 = myList2.iterator();
        for (int i = 0; i < 1000000; i++) {
            myList1.add("top");
            myList2.add("tip");
        }

        long t0 = System.nanoTime();
        while (iterator1.hasNext()) {
            iterator1.next();
        }
        System.out.println(System.nanoTime() - t0);
        t0 = System.nanoTime();
        while (iterator2.hasNext()) {
            iterator2.next();
        }
        System.out.println(System.nanoTime() - t0);
    }
}