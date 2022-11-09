package homework.day12;

public class Hedgehog {

    private String pattern;
    private String name;

    public Hedgehog(int number) {
        this.name = "Hedgehog" + "<" + number + ">";
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void tellMe() throws InterruptedException {

        System.out.println("I am" + this.name);
        Thread.sleep(50);

    }

}
