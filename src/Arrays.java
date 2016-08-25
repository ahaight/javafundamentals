/**
 * Created by aaronhaight on 7/27/16.
 */
public class Arrays {

    public static void main(String[] args) {

//      long way of doing it...
//      float[] theVals = new float[3];
//      theVals[0] = 10.0f;
//      theVals[1] = 20.0f;
//      theVals[2] = 15.0f;

//      better way of doing it...
        float[] theVals = { 10.0f, 20.0f, 15.0f };

        float sum = 0.0f;

        for(int i = 0; i < theVals.length; i++)
            sum += theVals[i];

        System.out.println(sum);
    }
}
