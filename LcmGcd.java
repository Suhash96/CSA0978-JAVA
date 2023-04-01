import java.util.Scanner;

 class LcmGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N value = ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i+1) + " = ");
            numbers[i] = sc.nextInt();
        }
        int lcm = lcm(numbers);
        int gcd = gcd(numbers);
        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
        sc.close();
    }

    public static int lcm(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = lcm(result, numbers[i]);
        }
        return result;
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static int gcd(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
        }
        return result;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}