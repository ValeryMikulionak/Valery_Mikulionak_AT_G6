package homework.day12;

import java.util.ArrayList;
import java.util.List;

public class PotokMouse4 {

    private static List<Mouse> mouse = new ArrayList<>();

    public static void main(String[] args) {

        Object lock = new Object();

        Thread t = Thread.currentThread();

        for (int i = 1; i <= 10; i++) {
            mouse.add(new Mouse(i));
        }

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                mouseDelete();
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                mouseDelete();
            }
        });

        Thread t3 = new Thread(() -> {
            synchronized (lock) {
                mouseDelete();
            }
        });

        Thread t4 = new Thread(() -> {
            synchronized (lock) {
                mouseDelete();
            }
        });

        Thread t5 = new Thread(() -> {
            synchronized (lock) {
                mouseDelete();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    public static void mouseDelete() {

        for (int i = 0; i < mouse.size(); i++) {
            try {
                mouse.get(0).peep();
                mouse.remove(0);
                i--;
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
