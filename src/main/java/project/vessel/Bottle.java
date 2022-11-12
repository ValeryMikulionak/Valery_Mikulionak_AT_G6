package project.vessel;

import project.stuff.Transformable;
import project.stuff.Bubble;
import project.stuff.SparklingWater;
import project.stuff.Water;
import project.material.Material;

import java.util.ArrayList;
import java.util.List;

public class Bottle extends Vessel implements Containable{
    private Water water;
    private Transformable stuff;

    public Bottle(double volume, Material material) {
        super(volume, 2.0, material);
        int puzir = (int) (volume * 10000);
        List<Bubble> bubbles = new ArrayList<>();
        for (int i = 0; i < puzir; i++) {
            bubbles.add(new Bubble("CO"));
        }
        this.water = new SparklingWater();
        ((SparklingWater) water).pump(bubbles);
        System.out.printf("Создаю бутылку объёма %s", volume).println();
    }

    public Bottle(double volume) {
        this(volume, Material.Glass);
    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    public void open() {
        System.out.printf("Открываю бутылку").println();
        ((SparklingWater)water).setOpened();
        }

    @Override
    public void close() {

    }

    public void warm (int temperature) {
        stuff.setTemperature(temperature);
        System.out.printf("Устанавливаю температуру воды", temperature).println();
        }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

}
