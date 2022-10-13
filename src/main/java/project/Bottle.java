package project;

public class Bottle {

    private double volume;
    private Water water;
    private int Puzir;

    public Bottle(double volume) {
        Puzir = (int) (volume * 10000);
        Bubble[] massiv = new Bubble[Puzir];
        ((SparklingWater) water).pump(massiv);
    }

        //в котором бутылка заполняется массивом из пузырьков
        // из рассчета 10000 на каждый литр

    public void open(){
        ((SparklingWater)water).setOpened(true);
            //меняет состояние воды в "открытое"
            // (приблизительно, как this.water.setOpened(true);)
        }

    public void warm (int temperature) {
        water.setTemperature(temperature);
        }
    //устанавливает температуру воды в бутылке

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

}
