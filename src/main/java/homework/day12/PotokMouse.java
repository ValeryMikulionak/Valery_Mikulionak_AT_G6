package homework.day12;

import java.util.ArrayList;
import java.util.Collection;

public class PotokMouse {

    public static void main(String[] args) {

        Thread t1 = new Thread(PotokMouse::mouseCollect);

        Thread t2 = new Thread(PotokMouse::mouseCollect);

        Thread t3 = new Thread(PotokMouse::mouseCollect);

        Thread t4 = new Thread(PotokMouse::mouseCollect);

        Thread t5 = new Thread(PotokMouse::mouseCollect);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

    public static void mouseCollect() {

        Collection<Mouse> mouse = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            mouse.add(new Mouse(i));
        }
        mouse.forEach(Mouse -> {
            try {
                Mouse.peep();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
