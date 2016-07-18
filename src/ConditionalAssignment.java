/**
 * Created by aaronhaight on 7/16/16.
 */
public class ConditionalAssignment {

    public static void main(String[] args) {
        int v1 = 7;
        int v2 = 5;

        int vMax = v1 > v2 ? v1 : v2;

        System.out.println(vMax);
        assign();
    }

    private static void assign() {
        float students = 30;
        float rooms = 4;

        float studentsPerRoom = rooms == 0.0f ? 0.0f : students/rooms;

        System.out.println(studentsPerRoom);
    }
}
