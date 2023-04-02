import java.util.Scanner;

public class NumberAverages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, posCount = 0, negCount = 0;
        double posSum = 0, negSum = 0;

        while (true) {
            System.out.print("Enter the number: ");
            num = sc.nextInt();
            if (num == -1) {
                break;
            } else if (num >= 0) {
                posCount++;
                posSum += num;
            } else {
                negCount++;
                negSum += num;
            }
        }

        double posAvg = posCount == 0 ? 0 : posSum / posCount;
        double negAvg = negCount == 0 ? 0 : negSum / negCount;

        System.out.println("The average of negative numbers is: " + negAvg);
        System.out.println("The average of positive numbers is: " + posAvg);
    }
}