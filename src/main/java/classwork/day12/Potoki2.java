package classwork.day12;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class Potoki2 {

    public static void main(String[] args) throws InterruptedException {

        AtomicLong co = new AtomicLong();

        Map<Integer, Integer> map = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
                for (int i = 0; i < 1_0_000; i++) {
                    co.incrementAndGet();
                }
        });

        Thread t2 = new Thread(() -> {
                for (int i = 0; i < 1_0_000; i++) {
                    co.decrementAndGet();
                }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(co);

    }
}
