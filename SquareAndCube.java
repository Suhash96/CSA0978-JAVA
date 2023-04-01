import java.util.Scanner;

 class SquareAndCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double num = scanner.nextDouble();
        scanner.close();
        
        double square = num * num;
        double cube = num * num * num;
        
        System.out.println("Square of " + num + " is " + square);
        System.out.println("Cube of " + num + " is " + cube);
    }
}