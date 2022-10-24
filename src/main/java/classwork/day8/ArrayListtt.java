package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListtt {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        String[] list = "мама мыла раму мыла".split(" ");
        for (String str: list) {
            myList.add(str);
        }
        for (String str:myList){
            System.out.println(str);
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
