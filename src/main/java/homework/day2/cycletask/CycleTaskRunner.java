package main.java.homework.day2.cycletask;

import homework.day2.cycletask.Massivnaoborot;

public class CycleTaskRunner {

    public static void main(String[] args) {
        Whiletask vivodchisel = new Whiletask();
        Fortask nechet = new Fortask();
        Massivrandom massiv = new Massivrandom();
        int[] myMassiv = massiv.returnNewMassiv();
        Massivnaoborot naob = new Massivnaoborot();

        vivodchisel.returnNewWhile();
        System.out.println();
        System.out.println();
        nechet.returnNewFor();
        System.out.println();
        massiv.returnNewMassiv();
        System.out.println();
        naob.massivNaoborot(myMassiv);
    }
}
