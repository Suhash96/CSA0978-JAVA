import java.util.Scanner;

class EvenSumOfFibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int a = 0, b = 1, c = 0, evenSum = 0;
        
        while (c <= n) {
            if (c % 2 == 0) {
                evenSum += c;
            }
            a = b;
            b = c;
            c = a + b;
        }
        
        System.out.println("The even sum of Fibonacci series till " + n + " is " + evenSum);
    }
}