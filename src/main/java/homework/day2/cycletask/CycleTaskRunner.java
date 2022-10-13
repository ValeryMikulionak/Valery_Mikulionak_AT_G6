package homework.day2.cycletask;

import homework.day2.cycletask.*;

public class CycleTaskRunner {

    public static void main(String[] args) {
        Whiletask vivodchisel = new Whiletask();
        Fortask nechet = new Fortask();
        MassivRandom massiv = new MassivRandom();
        int[] myMassiv = massiv.returnNewMassiv();
        MassivPechat pechat = new MassivPechat();
        MassivNaoborot naoborot = new MassivNaoborot();
        MassivFive five = new MassivFive();
        MassivKvadrat kvadrat = new MassivKvadrat();
        MinElement element = new MinElement();
        MassivZamena zamena = new MassivZamena();
        MassivSort sort = new MassivSort();

        vivodchisel.returnNewWhile();
        System.out.println();
        System.out.println();
        nechet.returnNewFor();
        System.out.println();
        pechat.massivPechat(myMassiv);
        System.out.println();
        naoborot.massivNaoborot(myMassiv);
        System.out.println();
        five.massivFive(myMassiv);
        System.out.println();
        kvadrat.massivKvadrat(myMassiv);
        System.out.println();
        element.minElement(myMassiv);
        System.out.println();
        zamena.massivZamena(myMassiv);
        System.out.println();
        sort.massivSort(myMassiv);
    }
}
