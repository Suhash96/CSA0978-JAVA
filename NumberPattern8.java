class NumberPattern8 {
    public static void main(String[] args) {
        int n = 4;

        // loop to print the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}