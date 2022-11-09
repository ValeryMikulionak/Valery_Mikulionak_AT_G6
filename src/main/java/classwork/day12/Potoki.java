package classwork.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Potoki {

    private static int sum = 0;

    public static void main(String[] args) {

        Map<Integer, Integer> map = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1_0_000; i++) {
                map.put(i, i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1_0_000; i++) {
                map.forEach((k, v) -> sum += v);
            }
            System.out.println(sum);
        });

        t1.start();
        t2.start();

    }
}