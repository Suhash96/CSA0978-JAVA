import java.util.Scanner;

class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the symbol to be printed: ");
        char symbol = input.next().charAt(0);
        System.out.print("Enter the size of the square: ");
        int size = input.nextInt();
        input.close();

        // print the pattern
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // print the symbol for the first and last row
                // or for the first and last column
                // or for the cells that form the diagonal line
                if (i == 1 || i == size || j == 1 || j == size || i == j || j == size-i+1) {
                    System.out.print(symbol + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}