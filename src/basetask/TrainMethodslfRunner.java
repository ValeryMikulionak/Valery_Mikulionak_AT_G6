package basetask;

public class TrainMethodslfRunner {

    public static void main(String[] args) {
        TrainMethodslf sravn = new TrainMethodslf();
        System.out.println("метод returnNewInt вернул " + sravn.returnNewInt(7));
        System.out.println("метод returnNewLong вернул " + sravn.returnNewLong(351));
        System.out.println("метод returnNewChar вернул " + sravn.returnNewChar('\u0067'));
        System.out.println("метод returnNewFloat вернул " + sravn.returnNewFloat(0.67F));
        System.out.println("метод returnNewDouble вернул " + sravn.returnNewDouble(500));
        sravn.returnNewBoolean(true);
    }

}
