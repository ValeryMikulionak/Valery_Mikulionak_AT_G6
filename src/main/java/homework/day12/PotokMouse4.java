package homework.day12;

import java.util.ArrayList;
import java.util.List;

public class PotokMouse4 {

    private static List<Mouse> mouse = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        Thread t = Thread.currentThread();

        for (int i = 1; i <= 10; i++) {
            mouse.add(new Mouse(i));
        }


        Thread t1 = new Thread(() -> {
            while (!mouse.isEmpty()) {
                try {
                    System.out.println(1);
                    mouseDelete();
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (!mouse.isEmpty()) {
                try {
                    System.out.println(2);
                    mouseDelete();
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t3 = new Thread(() -> {
            while (!mouse.isEmpty()) {
                try {
                    System.out.println(3);
                    mouseDelete();
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t4 = new Thread(() -> {
            while (!mouse.isEmpty()) {
                try {
                    System.out.println(4);
                    mouseDelete();
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t5 = new Thread(() -> {
            while (!mouse.isEmpty()) {
                try {
                    System.out.println(5);
                    mouseDelete();
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        Thread.sleep(3000);
        System.out.println("КАМОООООООН");
    }

    public static synchronized void mouseDelete() throws InterruptedException {
            try {
                mouse.get(0).peep();
                mouse.remove(0);
            } catch (IndexOutOfBoundsException e) {
            }

    }
}
