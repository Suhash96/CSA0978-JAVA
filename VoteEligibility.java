import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("You are not eligible to vote");
            System.out.println("You can vote after " + yearsLeft + " years");
        }
        
        input.close();
    }
}
