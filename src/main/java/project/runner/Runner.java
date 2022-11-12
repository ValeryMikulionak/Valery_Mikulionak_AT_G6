package project.runner;

import project.vessel.Bottle;

public class Runner {

    public static void main(String[] args) throws InterruptedException {

        Bottle butMal = new Bottle(0.005);
        butMal.open();
        System.out.println();
        Thread.sleep((long)(butMal.getVolume() * 1000000));

        Bottle butSr = new Bottle(0.01);
        butSr.open();
        System.out.println();
        Thread.sleep((long)(butSr.getVolume() * 1000000));

        Bottle butBig = new Bottle(0.015);
        butBig.open();

    }

}
