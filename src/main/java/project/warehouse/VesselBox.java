package project.warehouse;

import project.vessel.Containable;

import java.util.List;

public class VesselBox {

    private String name;
    //имя ящика, по маске "I am box with <25> <Bottles>"

    private int capacity;
    //вместимость ящика

    private List<Containable> box;
    //коллекция обьектов типа Containable

    private long id;
    //уникальный ID для каждого нового обьекта, имеет геттер, но не сеттера, инициализируются в конструкторе

    public boolean equals(Object o) {
        return false;
    }
    //переписанный метод equals

    public int hashCode() {
        return 0;
    }
    //переписанный метод hashCode, причем у каждого нового ящика он должен быть уникальным

    public VesselBox(String name, List<Containable> box) {

    }
    //конструктор, где инициализируются все 3 переменные

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Containable> getBox() {
        return box;
    }

    public long getId() {
        return id;
    }
}
