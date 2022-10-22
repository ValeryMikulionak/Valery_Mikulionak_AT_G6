package homework.day6;

public class StaticStringRunner {

    public static void main(String[] args) {
        StaticStringPechatStolbik.pechatStroki("камон");
        System.out.println();
        StaticStringDublicates.poiskDublicates("мама мыла мама мыла мама раму");
        System.out.println();
        System.out.println();
        StaticStringArrayChisel.poiskChisel("3ddds344dff5fff555ff5f");
        System.out.println();
        System.out.println();
  //      StaticStringLog.log("access_log.2020.09.07 212.168.101.5 granted\n" + "access_log.2020.09.07 212.168.101.6 denied\n" + "access_log.2020.09.07 212.168.101.6 denied\n" + "access_log.2020.09.07 212.168.122.6 denied");
        System.out.println();
        StaticStringVivodData.vivodData();
        System.out.println();
  //      StraticStringVvodVivodData.vvodVivodData("22.00 07.09.2020");
        System.out.println();
        DlyzTestov test = new DlyzTestov();
        test.test("access_log.2020.09.07 212.168.101.52 granted\n" + "access_log.2020.09.07 212.168.101.63 denied\n" + "access_log.2020.09.07 212.168.101.63 denied\n" + "access_log.2020.09.07 212.168.122.6 denied");
    }

}
