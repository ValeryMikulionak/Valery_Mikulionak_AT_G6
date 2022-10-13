package homework.day2.basetask;

public class TrainMethodsReturn {

    public int returnNewInt(int testint) {
        return (testint * 3);
    }

    public long returnNewLong(long testlong) {
        return (testlong - 4);
    }

    public String returnNewChar(char testchar) {
        String x = String.valueOf(testchar);
        return (x + x);
    }

    public float returnNewFloat(float testfloat) {
        return (testfloat / 2);
    }

    public double returnNewDouble(double testdouble) {
        return (testdouble + 8);
    }

    public short returnNewShort(short testshort) {
        return (short) (testshort - 1);
    }

    public byte returnNewByte(byte testbyte) {
        return (byte) (testbyte * 2);
    }

    public boolean returnNewBoolean(boolean testboolean) {
        if (testboolean == true) {
            return false;
        } else  {
            return true;
        }
    }

}
