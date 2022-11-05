package project.staff;

public interface Transformable {

    void mix();
    //mixes particles of stuff against each other
    void setOpened();
    //меняет состояние вещества на "открытое"
    void setTemperature(int temperature);
    //смешивает частицы материала друг с другом
}
