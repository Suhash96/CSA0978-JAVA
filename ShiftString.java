import java.util.Scanner;

public class ShiftString {
    public static boolean canShift(String s, String goal) {
        String s2 = s + s;
        return s2.contains(goal);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string s: ");
        String s = input.nextLine();

        System.out.print("Enter the string goal: ");
        String goal = input.nextLine();

        boolean result = canShift(s, goal);
        System.out.println(result);
    }
}
