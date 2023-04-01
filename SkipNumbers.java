import java.util.Scanner;

 class SkipNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of M: ");
        int m = scanner.nextInt();
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();
        scanner.close();
        
        for (int i = m; i <= n; i += k + 1) {
            System.out.print(i + " ");
        }
    }
}
