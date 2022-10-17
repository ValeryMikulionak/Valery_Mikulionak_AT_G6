package classwork.day6;

public class ObjectContainerRunner {

    public static void main(String[] args) {

        ObjectContainer testContainer = new ObjectContainer();

        testContainer.add(1);
        testContainer.add(8);
        testContainer.add(24);
        testContainer.add(65);
        testContainer.add(45);
        testContainer.add(12);
        testContainer.add(13);
        testContainer.add(44);
        testContainer.add(68);
        testContainer.add(110);
        System.out.println();

        testContainer.removeLast();

        testContainer.isEmpty();

    }

}
