package project.warehouse;

import project.material.Material;
import project.stuff.Transformable;
import project.vessel.Containable;

public class Factory {

    private Warehouse warehouse;
    //обьект склада для хранения ящиков с геттерами и сеттерами

    public void createVesselBox(int capacity, double volume, Material material, Transformable stuff, Class<?> clazz) {

    }
    //метод для создания ящика, прнимающий его вместимость, обьем тары, материал тары, содержимое тары, класс тары

    private Containable createVessel(double volume, Material material, Transformable stuff, Class<?> clazz) {
        return null;
    }
    //метод для создания бутылки с содержимым, прнимающий обьем тары, материал тары,
    // содержимое тары, класс тары, вызывается в методе createVesselBox

}
