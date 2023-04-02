import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        sc.close();
        
        int count = 0, num = 1;
        while (count < n) {
            if (isPerfectNumber(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    // function to check if a number is a perfect number
    static boolean isPerfectNumber(int n) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum == n && n != 1;
    }
}