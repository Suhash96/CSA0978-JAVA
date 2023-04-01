import java.util.Scanner;

 class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int sumFactors = 0;
        
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumFactors += i;
            }
        }
        
        if (sumFactors == n) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }
    }
}