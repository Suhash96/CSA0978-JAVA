 class ugly {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int n1 = 6;
        boolean isUgly1 = solution.isUgly(n1);
        System.out.println(n1 + " is an ugly number: " + isUgly1);
        
        int n2 = 1;
        boolean isUgly2 = solution.isUgly(n2);
        System.out.println(n2 + " is an ugly number: " + isUgly2);
        
        int n3 = 14;
        boolean isUgly3 = solution.isUgly(n3);
        System.out.println(n3 + " is an ugly number: " + isUgly3);
    }
}