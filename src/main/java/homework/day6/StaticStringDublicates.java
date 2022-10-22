package homework.day6;

public class StaticStringDublicates {

    public static void poiskDublicates(String str) {

        String concatim = "";
        String[] dubl = str.split(" ");
        for (int i = 0; i < dubl.length; i++) {
            for (int j = i + 1; j < dubl.length; j++) {
                if (dubl[i].equals(dubl[j])) {
                    if (!concatim.contains(dubl[i])) {
                        concatim = concatim.concat(dubl[i]);
                        System.out.printf(dubl[i] + " ");
                    }
                }
            }
        }
    }
}
