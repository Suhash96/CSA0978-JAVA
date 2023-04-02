import java.util.Arrays;

 class MaxMinSumDiff {
    public static void main(String[] args) {
        int[] arr = {14, 16, 87, 36, 25, 89, 34};
        int m = 1, n = 3;

        // Sort the array in descending order
        Arrays.sort(arr);
        int len = arr.length;
        int firstMax = arr[len - m];
        int thirdMin = arr[n - 1];
        int sum = firstMax + thirdMin;
        int diff = firstMax - thirdMin;

        System.out.println("1st Maximum Number = " + firstMax);
        System.out.println("3rd Minimum Number = " + thirdMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
    }
}