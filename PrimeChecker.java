import java.util.Scanner;

public class PrimeChecker implements Runnable {
    private int num;

    public PrimeChecker(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (or -1 to exit): ");

            if (sc.hasNextInt()) {
                int num = sc.nextInt();

                if (num == -1) {
                    break;
                }

                PrimeChecker pc = new PrimeChecker(num);
                Thread t = new Thread(pc);
                t.start();
            } else {
                System.out.println("Invalid input!");
                sc.next(); // consume the non-integer input
            }
        }
    }
}
