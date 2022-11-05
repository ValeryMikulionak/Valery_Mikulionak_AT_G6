package project.vessel;

import project.staff.Transformable;
import project.staff.Bubble;
import project.staff.SparklingWater;
import project.staff.Water;
import project.material.Glass;
import project.material.Material;

import java.util.ArrayList;
import java.util.List;

public class Bottle extends Vessel implements Containable{
    private Water water;

    public Bottle(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }

    public Bottle() {
        super(0, 2, 0, new Glass());
    }

    public Bottle(double volume) {
        this();
        setVolume(volume);
        int puzir = (int) (volume * 10);
        List<Bubble> bubbles = new ArrayList<>();
        for (int i = 0; i < puzir; i++) {
            bubbles.add(new Bubble("CO"));
        }
        water = new SparklingWater();
        ((SparklingWater) water).pump(bubbles);
        System.out.printf("Создаю бутылку объёма %s", volume).println();
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
        ((SparklingWater)water).setOpened(true);
        }

    @Override
    public void close() {

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
