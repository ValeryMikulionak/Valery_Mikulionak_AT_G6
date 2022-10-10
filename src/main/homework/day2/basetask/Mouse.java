package main.homework.day2.basetask;

public class Mouse {

    public String name;
    public int age;

    public Mouse() {
        name = "Кролик";
        age = 5;
    }

    public Mouse(String testname, int testage) {
        this.name = testname;
        this.age = testage;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printMouseDetails() {
        System.out.println("Я мышь, меня зовут " + name + " и мне " + age + " лет");
    }

}
