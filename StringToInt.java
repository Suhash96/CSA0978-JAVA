import java.util.Scanner;

 class StringToInt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        int num = 0;
        for(int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            num = num * 10 + digit;
        }
        
        System.out.println("Output integer: " + num);
    }
}