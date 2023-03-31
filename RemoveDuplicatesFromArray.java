import java.util.Arrays;

class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 6, 5};
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println(Arrays.toString(uniqueArr));
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
