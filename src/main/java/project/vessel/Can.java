package project.vessel;

import project.stuff.Transformable;
import project.material.Material;

public class Can extends Vessel implements Containable{
    public Can(double volume, Material material) {
        super(volume, 10.0, material);
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
    public int getFreeSpace() {
        return 0;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void warm(int temperature) {
        stuff.setTemperature(temperature);
    }
}
