package project.material;

public class Glass extends Material{
    public Glass(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }

    public Glass(){
        super(0.017, "green", 2200);
    }
}
