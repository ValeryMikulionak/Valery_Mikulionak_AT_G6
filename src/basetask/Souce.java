package basetask;

public class Souce {

    public String name;
    public String color;

    public Souce() {
        name = "кетчуп";
        color = "красный";
    }

    public Souce(String testname, String testcolor) {
        this.name = testname;
        this.color = testcolor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void printSouceDetails() {
        System.out.println("Это соус " + name + " " + color + " цвета");
    }

}
