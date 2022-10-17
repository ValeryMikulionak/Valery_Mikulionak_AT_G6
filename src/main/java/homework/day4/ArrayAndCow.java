package homework.day4;

import java.time.LocalDate;

public class ArrayAndCow {

    public static void main(String[] args) {
        ArrayAndCow arrayAndCow = new ArrayAndCow();
        int[] array = new int[]{4, 5, 16, 134, 453, 4354, 54521};
        arrayAndCow.countElementArray(array, 5);
        System.out.println();
        int[] arrayn = new int[]{4, 8, 15, 16, 23, 42};
        arrayAndCow.arrayNaoborot(arrayn, 7);
        System.out.println();
        arrayAndCow.cow();
        System.out.println();
        int[] arraymonth = new int[]{4, 5, 10, 130, 450, 4354, 54521};
        arrayAndCow.sumOfArrayKratMonth(arraymonth);
    }

    public void countElementArray(int[] array, int n) {

        int sum;
        if (n < 0 || n > array.length - 1) {
            System.out.println("Нету числа под таким номером");
        } else {
            sum = array[n];
            System.out.println(sum);
        }

    }

    public void arrayNaoborot(int[] array, int n) {

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                counter++;
            }
        }

        int y = 0;
        int[] arrayn = new int[counter];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                arrayn[y++] = array[i];
            }
        }
        for (int z = arrayn.length - 1; z >= 0; z--) {
            System.out.printf(arrayn[z] + " ");
            System.out.println();
        }

    }

    public void sumOfArrayKratMonth(int[] array) {

        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % month == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);

    }

    public void cow() {
        System.out.println("\t  ^__^");
        System.out.println("\t  (oo)\\\\_______");
        System.out.println("\t (__)\\ ) \\/\\  \\");
        System.out.println("\t      ||----w |\\");
        System.out.println("\t      ||     ||");


    }

}
