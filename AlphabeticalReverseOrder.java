import java.util.Arrays;
import java.util.Scanner;

 class AlphabeticalReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.nextLine();

        // convert word to character array and sort it in reverse order
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}