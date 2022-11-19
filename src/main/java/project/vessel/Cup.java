package project.vessel;

import project.stuff.Transformable;
import project.material.Material;

public class Cup extends Vessel implements Containable{
    public Cup(double volume, Material material) {
        super(volume, 8.0, material);
    }

    private Transformable stuff;

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
    public void open() {
    }

    @Override
    public void warm(int temperature) {
        stuff.setTemperature(temperature);
    }
}
