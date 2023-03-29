import java.util.Scanner;
 class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        input.close();

        // print the pattern
        for (int i = rows; i >= 1; i--) {
            // print spaces
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            // move to next line
            System.out.println();
        }
    }
}