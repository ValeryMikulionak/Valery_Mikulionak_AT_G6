package classwork.day6;

public class ObjectContainer {


    private Object[] container = new Object[10];
    private int place = 0;


    public void add(Object incoming) {

        if (place < container.length) {
            container[place++] = incoming;
            System.out.println(incoming);
        }
    }

    public Object removeLast() {

        Object del = container[place - 1];
        container[place-- - 1] = null;

        System.out.println(del);
        return del;
    }

    public boolean isEmpty() {

        return place == 0;
    }

}
