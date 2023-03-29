import java.util.Scanner;

 class RemoveConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Removing consonants from the input string
        String result = inputString.replaceAll("[^aeiouAEIOU]", "");

        System.out.println("Result: " + result);
    }
}