package homework.day6;

public class StaticStringArrayChisel {

    public static void poiskChisel(String str) {
        String[] poisk = str.split("");
        int counter = 0;
        for (int i = 0; i < poisk.length; i++) {
            if (poisk[i].matches("[0-9]")) {
                counter++;
            }
        }

        int[] array = new int[counter];
        int j = 0;
        for (int i = 0; i < poisk.length; i++) {
            if (poisk[i].matches("[0-9]")) {
                array[j++] = Integer.parseInt(poisk[i]);
            }
        }
        for (int z = 0; z < array.length; z++) {
            System.out.printf(array[z] + " ");
        }
    }
}
