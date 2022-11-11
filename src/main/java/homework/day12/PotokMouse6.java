package homework.day12;

import java.util.ArrayList;
import java.util.List;

public class PotokMouse6 {

    private static List<Mouse> mouse = new ArrayList<>();

    public static void main(String[] args) {

        Object lock = new Object();

        Thread t = Thread.currentThread();

        for (int i = 1; i <= 420; i++) {
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

        Thread t6 = new Thread(() -> {
            synchronized (lock) {
                mouseDelete();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }

    public static void mouseDelete() {

        for (int i = 0; i < mouse.size(); i++) {
            if (Integer.parseInt(mouse.get(i).getName().replaceAll("[^0-9]", "")) % 2 == 0) {
                try {
                    mouse.get(i).peep();
                    mouse.remove(i);
                    i--;
                    Thread.sleep(170);
                    System.out.println(mouse.size());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
