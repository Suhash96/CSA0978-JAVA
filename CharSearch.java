import java.util.Scanner;

 class CharSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input string from user
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        // Read character to be searched from user
        System.out.print("Enter the character to be searched: ");
        char ch = sc.next().charAt(0);

        int index = -1;  // Initialize index to -1

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // If character is found, store its index and break the loop
            if (str.charAt(i) == ch) {
                index = i;
                break;
            }
        }

        // Check if character was found or not
        if (index != -1) {
            System.out.println(ch + " is found in string at index: " + index);
        } else {
            System.out.println(ch + " is not found in string.");
        }

        sc.close();
    }
}