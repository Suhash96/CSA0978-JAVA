import java.util.Scanner;

 class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int countFactors = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                countFactors++;
            }
        }
        
        System.out.println("Number of factors for " + n + " is " + countFactors);
    }
}