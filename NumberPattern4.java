import java.util.Scanner;

 class NumberPattern4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be printed: ");
        int num = input.nextInt();
        System.out.print("Enter the maximum number of times to be printed: ");
        int max = input.nextInt();
        input.close();

        // print the pattern
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
        for (int i = max-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}