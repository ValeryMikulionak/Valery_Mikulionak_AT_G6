package classwork.day6;

public class GenericContainer <T> {
    private T[] container;
    private int place;


    public GenericContainer() {

    container = (T[]) new Object[10];
    int place = 0;
}

    public void add(T incoming) {

        if (place < container.length) {
            container[place++] = incoming;
            System.out.println(incoming);
        }
    }

    public T removeLast() {
        T result = null;

        Object del = container[place - 1];
        container[place-- - 1] = null;

        System.out.println(del);
        return (T) del;
    }

    public boolean isEmpty() {

        return place == 0;
    }

}
