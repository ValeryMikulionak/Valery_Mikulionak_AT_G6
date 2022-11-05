package project.material;

public class Plastic extends Material{
    public Plastic(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }

    public Plastic(){
        super(0.2, "white", 1800);
    }

}
