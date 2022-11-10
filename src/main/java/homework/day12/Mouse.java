package homework.day12;

import java.util.regex.Pattern;

public class Mouse {

    private String pattern = String.valueOf(Pattern.compile("Mouse <n>"));
    private String name;

    public Mouse(int number) {
        this.name = "Mouse" + " <" + number + "> ";
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

    public void peep() throws InterruptedException {

        System.out.println(getName() + "PEEP!");
        Thread.sleep(200);

    }

}
