import java.util.Scanner;

 class NthOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting odd number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int count = 0;
        int current = start;
        
        while (count < n) {
            current += 2;
            count++;
        }
        
        System.out.println("The " + n + "th odd number after " + start + " is " + current);
    }
}