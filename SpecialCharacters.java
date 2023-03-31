import java.util.Scanner;
 class SpecialCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;
        System.out.print("Special characters: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.out.print(ch + " ");
                count++;
            }
        }

        System.out.println("\nNumber of special characters: " + count);

        sc.close();
    }
}