package project.packaging;

import project.Transformable;
import project.material.Material;
import project.material.Plastic;

public class Cup extends Vessel implements Containable{
    public Cup(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }

    public Cup() {
        super(0.5, 1, 2, new Plastic());

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

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
