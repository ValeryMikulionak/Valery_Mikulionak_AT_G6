package basetask;

public class TrainMethodslf {

    public int returnNewInt(int testint) {
        if (testint < 8) {
            return (testint * 7);
        } else
            return (testint / 4);
    }

    public long returnNewLong(long testlong) {
        if (testlong > 300) {
            return (testlong - 300);
        } else
            return (testlong + 20);
    }

    public String returnNewChar(char testchar) {
        String y = String.valueOf(testchar);
        if (y.equals("g")) {
            return ("go");
        } else
            return ("o" + y);
    }

    public float returnNewFloat(float testfloat) {
        if (testfloat == 0.67F) {
            return (testfloat);
        } else
            return (testfloat * 2);
    }

    public double returnNewDouble(double testdouble) {
        if (testdouble > 30 && testdouble < 80) {
            return (testdouble + 87);
        } else if (testdouble > 80 && testdouble < 400) {
            return (testdouble - 87);
        } else if (testdouble > 400) {
            return (testdouble / 4);
        } else
            return (testdouble);
    }

    public void returnNewBoolean(boolean testboolean) {
        if (testboolean = true) {
            System.out.println("Я получил на вход значение истины");
        } else
            System.out.println("Я получил на вход ложь");
    }

}