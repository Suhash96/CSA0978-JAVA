import java.util.Scanner;

 class RectanglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the symbol: ");
        char symbol = input.next().charAt(0);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        input.close();

        // print the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}