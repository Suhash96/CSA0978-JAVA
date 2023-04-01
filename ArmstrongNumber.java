import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        int temp = num;
        int digits = 0;
        
        // Count the number of digits in the given number
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        
        temp = num;
        
        // Compute the sum of the cubes of the digits in the given number
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        // Check if the sum is equal to the original number
        if (sum == num) {
            System.out.println("Given number is Armstrong number");
        } else {
            System.out.println("Given number is not Armstrong number");
        }
        
        sc.close();
    }
}