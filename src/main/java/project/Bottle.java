package project;

public class Bottle {

    private double volume;
    private Water water;
    private int puzir;

    public Bottle(double volume) {
        this.volume = volume;
        puzir = (int) (volume * 10000);
        Bubble[] bubbles = new Bubble[puzir];
        water = new SparklingWater();
        ((SparklingWater) water).pump(bubbles);
        System.out.printf("Создаю бутылку объёма %s", volume).println();
    }

    public void open(){
        System.out.printf("Открываю бутылку").println();
        ((SparklingWater)water).setOpened(true);
        }

    public void warm (int temperature) {
        water.setTemperature(temperature);
        System.out.printf("Устанавливаю температуру воды", temperature).println();
        }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

}
