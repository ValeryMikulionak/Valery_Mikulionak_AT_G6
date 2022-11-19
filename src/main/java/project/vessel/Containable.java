package project.vessel;

import project.stuff.Transformable;

public interface Containable {

    void addStuff (Transformable stuff);
    //adds some stuff (e.g. water, sand) to Containable object

    Transformable removeStuff();
    //removes all stuff away

    boolean isEmpty();
    //returns true if there is no stuff inside

    void open();
    //forces Containable to be opened

    public void warm(int temperature);
    //устанавливает температуру содержимого

}
