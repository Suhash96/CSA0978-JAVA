import java.util.Scanner;

 class CompositeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        scanner.close();
        
        System.out.println("Composite numbers between " + a + " and " + b + ":");
        
        for (int i = a; i <= b; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean isComposite(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }
        
        return false;
    }
}