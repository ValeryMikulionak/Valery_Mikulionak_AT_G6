package main.classwork.day2;

public class Ggg {

    public void fee() {
        int y = 0;
        for (int i = 23; i < 28; i++) {
            if (i % 13 == 0) {
                System.out.println("continue!");
                break;
                //return;
                //continue;
            }
            y = i;
            System.out.println("i is : " + i);
        }
        System.out.println("number is : " + y);

    }

}
