/**
 * Created by aaronhaight on 7/16/16.
 */
public class IfElseStatement {

    public static void main(String[] args) {
        int v1 = 10;
        int v2 = 4;

        if(v1 > v2)
            System.out.println("v1 is bigger");
        else
            System.out.println("v1 is not bigger");

        chain();
    }

    private static void chain() {
        int v1 = 10;
        int v2 = 40;

        if(v1 > v2)
            System.out.println("v1 is bigger");
        else if(v1 < v2)
            System.out.println("v2 is bigger");
        else
            System.out.println("v1 and v2 are equal");
    }
}
