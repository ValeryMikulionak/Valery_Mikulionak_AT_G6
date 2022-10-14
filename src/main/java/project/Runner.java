package project;

public class Runner {

    public static void main(String[] args){

        Bottle butmal = new Bottle(0.5);
        butmal.open();
        System.out.println();

        Bottle butsr = new Bottle(1.0);
        butsr.open();
        System.out.println();

        Bottle butbig = new Bottle(1.5);
        butbig.open();
    }

}
