package main.homework.day2.basetask;

public class Bee {

    public String gender;
    public long weight;

    public Bee() {
        gender = "Ж";
        weight = 1;
    }

    public Bee(String testgender, long testweight) {
        this.gender = testgender;
        this.weight = testweight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long getWeight() {
        return weight;
    }

    public void printBeeDetails() {
        System.out.println("Я легче лося в " + 500/weight + " раз");
    }

}
