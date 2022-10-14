package project;

public class Runner {

    public static void main(String[] args){
        Bottle butmal = new Bottle(0.5);
        System.out.println();
        Bottle butsr = new Bottle(1.0);
        System.out.println();
        Bottle butbig = new Bottle(1.5);

        butmal.open();
        butsr.open();
        butbig.open();
    }

}
