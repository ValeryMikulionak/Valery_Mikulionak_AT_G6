package classwork.day8;

import java.util.HashMap;
import java.util.Map;

public class HashMappp {

    public static void main(String[] args) {
        String[] array = "мама мыла раму мыла".split(" ");
        Map<Integer, String> words = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }
        for (int i : words.keySet()) {
            System.out.println(i);
        }

        for (String j : words.values()){
            System.out.println(j);
        }

        for (Map.Entry<Integer, String> z : words.entrySet()) {
            System.out.println(z);
        }
    }
}
