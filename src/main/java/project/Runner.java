package project;

import project.packaging.Bottle;

public class Runner {

    public static void main(String[] args) {

        Bottle butMal = new Bottle(0.5);
        butMal.open();
        System.out.println();

        Bottle butSr = new Bottle(1.0);
        butSr.open();
        System.out.println();

        Bottle butBig = new Bottle(1.5);
        butBig.open();
    }

}
