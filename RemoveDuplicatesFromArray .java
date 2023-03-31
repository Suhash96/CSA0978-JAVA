import java.util.Arrays;
import java.util.Scanner;

 class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("The unique elements of the array are: " + Arrays.toString(uniqueArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] uniqueArr = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int k = 0; k < j; k++) {
                if (arr[i] == uniqueArr[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueArr[j] = arr[i];
                j++;
            }
        }

        return Arrays.copyOf(uniqueArr, j);
    }
}
