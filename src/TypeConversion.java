/**
 * Created by aaronhaight on 7/14/16.
 */
public class TypeConversion {

    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 7;

        short result1 = (short)byteVal;
        short result2 = (short)(byteVal - longVal);
        float result3 = longVal - floatVal;
        long result4 = (long)(shortVal - longVal + floatVal + doubleVal);

        System.out.println("Success!");
    }
}
