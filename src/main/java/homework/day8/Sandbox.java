package homework.day8;

import homework.day8.basa.Person;
import homework.day8.basa.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sandbox {

    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        for (Sand s : sandbox) {
            System.out.printf(s.getWeight() + " ");
        }
        System.out.println();

        for (Sand s : sandbox) {
            System.out.printf(s.getName() + " ");
        }

        Map<Integer, Sand> map = new HashMap<>();
        for (int i = 0; i < sandbox.size(); i++) {
            map.put(i, sandbox.get(i));
        }

        for (int j : map.keySet()) {
            System.out.println(j);
        }

        for (Sand x : map.values()) {
            System.out.println(x);
        }

        for (Map.Entry<Integer, Sand> z : map.entrySet()) {
            System.out.println(z);

        }
    }
}