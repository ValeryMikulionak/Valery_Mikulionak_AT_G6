package homework.day8;

import homework.day8.basa.Chair;

import java.util.*;

public class Furniture {

    public static void main(String[] args) {

        List<Chair> furniture = new ArrayList<>(Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4)));

        for (Chair ch : furniture) {
            System.out.printf(ch.getHeight() * ch.getWidth() + " ");
        }
        System.out.println("\n");

        Map<Integer, Chair> map = new HashMap<>();
        for (int i = 0; i < furniture.size(); i++) {
            map.put(i, furniture.get(i));
        }

        for (int j : map.keySet()) {
            System.out.println(j);
        }

        for (Chair ch : map.values()) {
            System.out.println(ch);
        }

        for (Map.Entry<Integer, Chair> z : map.entrySet()) {
            System.out.println(z);
        }
    }
}