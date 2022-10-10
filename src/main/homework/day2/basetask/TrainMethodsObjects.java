package main.homework.day2.basetask;

public class TrainMethodsObjects {
    public void processMouse(Mouse testmouse) {
        System.out.println(testmouse.getName());
        System.out.println(testmouse.getAge());
        testmouse.printMouseDetails();
    }

    public void processSouce(Souce testsouce) {
        System.out.println(testsouce.getName());
        System.out.println(testsouce.getColor());
        testsouce.printSouceDetails();
    }

    public void processBee(Bee testbee) {
        System.out.println(testbee.getGender());
        System.out.println(testbee.getWeight());
        testbee.printBeeDetails();
    }

    public void processObstacle(Obstacle testobstacle) {
        System.out.println(testobstacle.getDescription());
        System.out.println(testobstacle.getSeverity());
        testobstacle.printObstacleDetails();
    }

    public void processPineapple(Pineapple testpineapple) {
        System.out.println(testpineapple.getGrade());
        System.out.println(testpineapple.getHeatCapacity());
        testpineapple.printPineappleDetails();
    }

}
