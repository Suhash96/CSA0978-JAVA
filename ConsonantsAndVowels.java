import java.util.Scanner;

 class ConsonantsAndVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        String vowels = "";
        String consonants = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels += ch + " ";
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonants += ch + " ";
            }
        }

        System.out.println("Consonants: " + consonants);
        System.out.println("Vowels: " + vowels);
    }
}