import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int upperCount = 0, lowerCount = 0, numCount = 0;
        char ch;

        while (true) {
            System.out.print("Enter any character: ");
            ch = sc.next().charAt(0);

            if (ch == '*') {
                break;
            }

            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else if (Character.isDigit(ch)) {
                numCount++;
            }
        }

        System.out.println("Total count of lower case: " + lowerCount);
        System.out.println("Total count of upper case: " + upperCount);
        System.out.println("Total count of numbers = " + numCount);
    }
}