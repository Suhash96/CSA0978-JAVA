import java.util.Scanner;

 class ReverseWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        
        String reverse = "";
        for(int i = word.length()-1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        
        System.out.println("Reverse word: " + reverse);
    }
}