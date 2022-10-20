package homework.day6;

public class StringObjectRunner {

    public static void main(String[] args) {
        StringPechatStolbik stolbik = new StringPechatStolbik();
        stolbik.pechatStroki("камон");
        System.out.println();
        StringArrayChisel chisla = new StringArrayChisel();
        chisla.poiskChisel("3ddds344dff5fff555ff5f");
        System.out.println();
        System.out.println();
        StringVivodData vivod = new StringVivodData();
        vivod.vivodData();
        System.out.println();
        StringVvodVivodData vvod = new StringVvodVivodData();
        vvod.vvodVivodData("22.00 07.09.2020");
    }

}
