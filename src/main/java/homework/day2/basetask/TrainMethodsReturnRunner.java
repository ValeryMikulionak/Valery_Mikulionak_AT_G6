package main.java.homework.day2.basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn caclculator = new TrainMethodsReturn();
        System.out.println("метод returnNewInt вернул " + caclculator.returnNewInt(5));
        System.out.println("метод returnNewLong вернул " + caclculator.returnNewLong(10));
        System.out.println("метод returnNewChar вернул " + caclculator.returnNewChar('\u0024'));
        System.out.println("метод returnNewFloat вернул " + caclculator.returnNewFloat(6.6F));
        System.out.println("метод returnNewDouble вернул " + caclculator.returnNewDouble(6));
        System.out.println("метод returnNewShort вернул " + caclculator.returnNewShort((short) 1));
        System.out.println("метод returnNewByte вернул " + caclculator.returnNewByte((byte) 8));
        System.out.println("метод returnNewBoolean вернул " + caclculator.returnNewBoolean(true));
    }

}
