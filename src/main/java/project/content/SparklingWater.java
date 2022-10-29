package project.content;

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

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
        System.out.printf("Меняю состояние воды на открытое - %s", isOpened).println();
        isOpened();
    }

    private void isOpened() {
        if (isOpened) {
            System.out.printf("Проверяю состояние воды на открытость - бутылка открыта %s", isOpened).println();
            degas();
        } else {
            System.out.printf("Проверяю состояние воды на открытость - бутылка закрыта %s", isOpened).println();
        }
    }

    private void degas() {
        int partiyaPuzir = 10 + (5 * getTemperature());
        System.out.printf("Выпускаю каждую секунду партию пузырей: %s", partiyaPuzir).println();
        for (int i = 0; i < bubbles.size(); i++){
            bubbles.get(i).cramp();
            bubbles.remove(i);
            i--;
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

    @Override
    public void mix() {

    }
}
