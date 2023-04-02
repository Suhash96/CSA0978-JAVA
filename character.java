import java.util.Scanner;
import java.util.Arrays;

class character{
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left < letters.length ? letters[left] : letters[0];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Reading input values
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        char[] letters = new char[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            letters[i] = input.next().charAt(0);
        }

        System.out.print("Enter the target character: ");
        char target = input.next().charAt(0);

        // Sorting the input array in non-decreasing order
        Arrays.sort(letters);

        // Finding the smallest character in letters that is lexicographically greater than target
        char result = nextGreatestLetter(letters, target);

        System.out.println("Output: " + result);
    }
}