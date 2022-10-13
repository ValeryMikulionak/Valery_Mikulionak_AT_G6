package project;

    public class SparklingWater extends Water {

        //public SparklingWater();
        private boolean isOpened;
        private Bubble[] bubbles;
        private int partiyaPuzir = bubbles.length;

        //constructor

        public void pump(Bubble[] bubbles) {
            this.bubbles = bubbles;
            //сетает массив из пузырьков в воду
        }

        public void setOpened(boolean isOpened) {
            this.isOpened = isOpened;
            //меняет состояние воды на "открытое"
        }

        private void isOpened() {
            if (isOpened == true) {
                degas();
            }
            //в новом потоке проверят состояние воды
            // на "открытость" и в случае, если она открыта
            // запускает метод degas()
        }

        private void degas() {
            for (int sec = 0; partiyaPuzir >= 0; sec++) {
                partiyaPuzir = partiyaPuzir - 10 - 5 * getTemperature();
            }
            //каждую секунду выпускает по партии пузырьков из
            // рассчета 10 + 5 * температура_воды
        }

        public boolean isSparkle() {
            if (partiyaPuzir > 0) {
                return true;
                //возвращающий true если в воде еще есть пузырьки газа
            } else {
                return false;
            }
        }
    }