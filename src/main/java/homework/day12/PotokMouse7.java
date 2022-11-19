package homework.day12;

import java.util.concurrent.CopyOnWriteArrayList;

public class PotokMouse7 {

    private static CopyOnWriteArrayList<Mouse> mouse = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {

        Object lock = new Object();

        Thread t = Thread.currentThread();

        for (int i = 1; i <= 10; i++) {
            mouse.add(new Mouse(i));
        }

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                mouseNechetDelete();
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                mouseChetDelete();
            }
        });

        Thread t3 = new Thread(() -> {
            synchronized (lock) {
                mouseNechetDelete();
            }
        });

        Thread t4 = new Thread(() -> {
            synchronized (lock) {
                mouseChetDelete();
            }
        });

        Thread t5 = new Thread(() -> {
            synchronized (lock) {
                mouseNechetDelete();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

    public static void mouseNechetDelete() {

      mouse.forEach(x -> {
          if (Integer.parseInt(x.getName().replaceAll("[^0-9]", "")) % 2 != 0) {
              try {
                  x.peep();
                  mouse.remove(x);
                  Thread.sleep(250);
                  System.out.println(mouse.size());
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
      });

    }

    public static void mouseChetDelete() {

        mouse.forEach(x -> {
            if (Integer.parseInt(x.getName().replaceAll("[^0-9]", "")) % 2 == 0) {
                try {
                    x.peep();
                    new Hedgehog(Integer.parseInt(x.getName().replaceAll("[^0-9]", ""))).tellMe();
                    Thread.sleep(220);
                    System.out.println(mouse.size());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

}
