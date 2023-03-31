public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int n1 = 2;
        int fib1 = solution.fib(n1);
        System.out.println("Fibonacci(" + n1 + ") = " + fib1);
        
        int n2 = 3;
        int fib2 = solution.fib(n2);
        System.out.println("Fibonacci(" + n2 + ") = " + fib2);
        
        int n3 = 4;
        int fib3 = solution.fib(n3);
        System.out.println("Fibonacci(" + n3 + ") = " + fib3);
    }
}