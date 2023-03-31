import java.util.Arrays;
import java.util.Scanner;

 class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // get input from user
        System.out.println("Enter names (separated by space): ");
        String input = scanner.nextLine();
        
        System.out.print("Sort order (A/D): ");
        String order = scanner.nextLine().toUpperCase();
        
        // split input into array of names
        String[] names = input.split("\\s+");
        
        // sort names in ascending or descending order based on user choice
        if (order.equals("A")) {
            Arrays.sort(names);
        } else if (order.equals("D")) {
            Arrays.sort(names, (a, b) -> b.compareTo(a));
        } else {
            System.out.println("Invalid sort order!");
            return;
        }
        
        // print sorted names
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}