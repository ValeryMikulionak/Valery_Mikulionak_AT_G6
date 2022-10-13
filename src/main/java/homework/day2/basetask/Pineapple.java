package homework.day2.basetask;

public class Pineapple {

        public String grade;
        public float heatCapacity;

        public Pineapple() {
            grade = "кислый";
            heatCapacity = 2.14F;
        }

        public Pineapple(String testgrade, float testheatCapacity) {
            this.grade = testgrade;
            this.heatCapacity = testheatCapacity;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getGrade() {
            return grade;
        }

        public void setHeatCapacity(float heatCapacity) {
            this.heatCapacity = heatCapacity;
        }

        public float getHeatCapacity() {
            return heatCapacity;
        }

        public void printPineappleDetails() {
            if (heatCapacity > 2140) {
                System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
            } else
                System.out.println("В ветчине тепла запасется больше :(");
        }

}
