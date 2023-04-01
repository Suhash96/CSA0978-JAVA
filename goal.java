 class ShiftString {
    public static boolean canShift(String s, String goal) {
        String s2 = s + s;
        return s2.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean result = canShift(s, goal);
        System.out.println(result); // Output: true
    }
}
