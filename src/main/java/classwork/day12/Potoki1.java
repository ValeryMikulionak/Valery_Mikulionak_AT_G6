package classwork.day12;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Potoki1 {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        Map<Integer, Integer> map = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 1_0_000; i++) {
                    counter++;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 1_0_000; i++) {
                    counter--;
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter);

    }
}
