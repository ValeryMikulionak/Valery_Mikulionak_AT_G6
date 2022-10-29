package project.packaging;

import project.Transformable;
import project.material.Material;
import project.material.Metal;

public class Can extends Vessel implements Containable{
    public Can(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }

    public Can(){
        super(0.3, 0.5, 1, new Metal());

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
