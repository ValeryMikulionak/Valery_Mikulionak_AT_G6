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
    }

        //в котором бутылка заполняется массивом из пузырьков
        // из рассчета 10000 на каждый литр

    public void open(){
        ((SparklingWater)water).setOpened(true);
        //System.out.printf("Меняю состояние воды на открытое %b", isOpened).println();
            //меняет состояние воды в "открытое"
            // (приблизительно, как this.water.setOpened(true);)
        }

    public void warm (int temperature) {
        water.setTemperature(temperature);
        System.out.printf("Устанавливаю температуру воды", temperature).println();
        }
    //устанавливает температуру воды в бутылке

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

}
