import java.util.HashMap;

 class ArrayFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        
        System.out.println("Element | Frequency");
        System.out.println("--------------------------");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + "       | " + frequencyMap.get(key));
        }
    }
}