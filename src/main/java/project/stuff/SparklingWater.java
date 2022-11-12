package project.stuff;

import java.util.List;

public class SparklingWater extends Water {

    private boolean isOpened;
    private List<Bubble> bubbles;

    public SparklingWater() {
        isOpened();
    }

    public void pump(List<Bubble> bubbles) {
        this.bubbles = bubbles;
        System.out.printf("Сетаю массив из пузырьков в воду", bubbles).println();
    }

    @Override
    public void setOpened() {
        this.isOpened = true;
        System.out.printf("Меняю состояние воды на открытое - %s", isOpened).println();
        isOpened();
    }

    private void isOpened() {
        Thread t1 = new Thread(() -> {
        if (isOpened) {
            System.out.printf("Проверяю состояние воды на открытость - бутылка открыта %s", isOpened).println();
            degas();
        } else {
            System.out.printf("Проверяю состояние воды на открытость - бутылка закрыта %s", isOpened).println();
        }
    });
        t1.start();
    }

    private void degas() {
        int partiyaPuzir = 10 + (5 * getTemperature());
        System.out.printf("Выпускаю каждую секунду партию пузырей: %s", partiyaPuzir).println();
        for (int i = 0; i < bubbles.size(); i++){
            bubbles.get(i).cramp();
            bubbles.remove(i);
            i--;
            try {
                Thread.sleep(1000 / partiyaPuzir);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (isSparkle()) {
                System.out.printf("В воде ещё есть пузыри %s", bubbles.size()).println();
            } else {
                System.out.printf("В воде больше нет пузырей").println();
            }
        }
    }

    public boolean isSparkle() {
        return !bubbles.isEmpty();
    }

}
