package homework.day6;

public class StaticStringPechatStolbik {

    public static void pechatStroki (String str){
        String[] stolbik = str.split("");
        for (int i = 0; i < str.length(); i++){
            System.out.println(stolbik[i]);
        }
    }

}
