package homework.day12;

import java.util.ArrayList;
import java.util.Collection;

public class PotokMouse2 {

    public static void main(String[] args) {

        Thread t1 = new Thread(PotokMouse2::mouseCollect);

        Thread t2 = new Thread(PotokMouse2::mouseCollect);

        Thread t3 = new Thread(PotokMouse2::mouseCollect);

        Thread t4 = new Thread(PotokMouse2::mouseCollect);

        Thread t5 = new Thread(PotokMouse2::mouseCollect);

        Thread t6 = new Thread(PotokMouse2::mouseCollect);

        Thread t7 = new Thread(PotokMouse2::mouseCollect);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

    }

    public static void mouseCollect() {

        Collection<Mouse> mouse = new ArrayList<>();

        for (int i = 1; i <= 18; i++) {
            mouse.add(new Mouse(i));
        }

        mouse.stream()
                .filter(mouse1 -> Integer.parseInt(mouse1.getName().replaceAll("[^0-9]", "")) % 2 == 0)
                .forEach(x -> {
                    try {
                        x.peep();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });

    }
}