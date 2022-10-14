package project;

    public class SparklingWater extends Water {

        private boolean isOpened;
        private Bubble[] bubbles;

        public SparklingWater(){
            isOpened();
        }

        public void pump(Bubble[] bubbles) {
            this.bubbles = bubbles;
        //    System.out.printf("Сетаю массив из пузырьков в воду", bubbles).println();
        }

        public void setOpened(boolean isOpened) {
            this.isOpened = isOpened;
            System.out.printf("Меняю состояние воды на открытое %b", isOpened).println();
            isOpened();
        }

        private void isOpened() {
            if (isOpened == true) {
                System.out.printf("Проверяю состояние воды на открытость, %b", isOpened).println();
                degas();
            }
        }

        private void degas() {
            int puzir = bubbles.length;
            int partiyaPuzir = 10 + (5 * getTemperature());
            Bubble bubble = new Bubble(null);
            for (int sec = 0; puzir >= 0; sec++) {
                puzir = puzir - partiyaPuzir;
                System.out.printf("Выпускаю каждую секунду партию пузырей: ", partiyaPuzir).println();
                bubble.cramp();
                isSparkle();
            }
        }

        public boolean isSparkle() {
             if (bubbles.length > 0) {
                return true;
                //возвращающий true если в воде еще есть пузырьки газа
            } else {
                return false;
            }
        }
    }