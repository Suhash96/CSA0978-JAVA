 class NumberPattern9 {
    public static void main(String[] args) {
        int n = 4;

        // loop to print the pattern
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k * k + " ");
                k++;
            }
            System.out.println();
        }
    }
}