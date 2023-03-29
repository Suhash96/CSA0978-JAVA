import java.util.Scanner;

class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        input.close();
        
        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            // print numbers
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}