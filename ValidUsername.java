import java.util.Scanner;

 class ValidUsername {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = input.nextLine();

        boolean valid = true;
        if (username.length() < 4 || username.length() > 20) {
            valid = false;
        }
        for (int i = 0; i < username.length(); i++) {
            if (!Character.isLetterOrDigit(username.charAt(i))) {
                valid = false;
                break;
            }
        }

        if (valid) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }
}