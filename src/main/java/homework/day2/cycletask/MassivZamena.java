package homework.day2.cycletask;

public class MassivZamena {

    public void massivZamena(int[] array) {

        int first = array[0];
        int last = array[array.length-1];
        int firstnew;
        int lastnew;
        firstnew = last;
        lastnew = first;
        System.out.print(firstnew + " ");
        for (int i = 1; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(lastnew);

        int x = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = x;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
