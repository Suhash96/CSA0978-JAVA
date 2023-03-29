
import java.util.Arrays;
import java.util.HashMap;

 class MeanMedianMode {
   public static void main(String[] args) {
      int[] arr = {16, 18, 27, 16, 23, 21, 19};
      int n = arr.length;
      
      // Mean
      int sum = 0;
      for(int i=0; i<n; i++) {
         sum += arr[i];
      }
      double mean = (double)sum / n;
      System.out.println("Mean = " + mean);
      
      // Median
      Arrays.sort(arr);
      double median;
      if(n % 2 == 0) {
         median = (double)(arr[n/2] + arr[n/2 - 1]) / 2;
      } else {
         median = (double)arr[n/2];
      }
      System.out.println("Median = " + median);
      
      // Mode
      HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
      int maxFreq = 0;
      int mode = 0;
      for(int i=0; i<n; i++) {
         int freq = freqMap.getOrDefault(arr[i], 0) + 1;
         freqMap.put(arr[i], freq);
         if(freq > maxFreq) {
            maxFreq = freq;
            mode = arr[i];
         }
      }
      System.out.println("Mode = " + mode);
   }
}