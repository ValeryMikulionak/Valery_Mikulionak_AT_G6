package main.homework.day2.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects eda = new TrainMethodsObjects();
        Mouse objectmouse = new Mouse("гусь", 8);
        eda.processMouse(objectmouse);
        System.out.println();
        Souce objectsouce = new Souce("чили", "красного");
        eda.processSouce(objectsouce);
        System.out.println();
        Bee objectbee = new Bee("М", 1);
        eda.processBee(objectbee);
        System.out.println();
        Obstacle objectobstacle = new Obstacle("дичь", "баг");
        eda.processObstacle(objectobstacle);
        System.out.println();
        Pineapple objectpineapple = new Pineapple("сладкий", 1989);
        eda.processPineapple(objectpineapple);
    }
}
