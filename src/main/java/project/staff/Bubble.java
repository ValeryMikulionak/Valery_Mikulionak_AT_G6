package project.staff;

public class Bubble {

    public static final double volume = 0.3D;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public void cramp(){
        System.out.println("Cramp!");
    }

    public double getVolume(){
        return volume;
    }

}
