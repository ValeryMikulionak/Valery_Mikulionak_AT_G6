package homework.day6;

public class StringObjectRunner {

    public static void main(String[] args) {
        StringPechatStolbik stolbik = new StringPechatStolbik();
        stolbik.pechatStroki("камон");
        System.out.println();
        StringDublicates dublicat = new StringDublicates();
        dublicat.poiskDublicates("мама мыла мама мыла мама раму");
        System.out.println();
        System.out.println();
        StringArrayChisel chisla = new StringArrayChisel();
        chisla.poiskChisel("3ddds344dff5fff555ff5f");
        System.out.println();
        System.out.println();
        StringLog logs = new StringLog();
        logs.log("access_log.2020.09.07 212.168.101.5 granted\n" + "access_log.2020.09.07 212.168.101.6 denied\n" + "access_log.2020.09.07 212.168.101.6 denied\n" + "access_log.2020.09.07 212.168.122.6 denied");
        System.out.println();
        StringVivodData vivod = new StringVivodData();
        vivod.vivodData();
        System.out.println();
        StringVvodVivodData vvod = new StringVvodVivodData();
        vvod.vvodVivodData("22.00 07.09.2020");
        System.out.println();
        DlyzTestov test = new DlyzTestov();
        test.test("access_log.2020.09.07 212.168.101.52 granted\n" + "access_log.2020.09.07 212.168.101.63 denied\n" + "access_log.2020.09.07 212.168.101.63 denied\n" + "access_log.2020.09.07 212.168.122.6 denied");
    }

}
