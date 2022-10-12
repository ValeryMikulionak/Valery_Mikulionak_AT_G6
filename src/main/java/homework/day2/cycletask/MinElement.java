package homework.day2.cycletask;

public class MinElement {

    public void minElement(int[] array) {

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                min = min;
            } else {
                min = array[i];
            }
        }
        System.out.println(min);
    }


}
