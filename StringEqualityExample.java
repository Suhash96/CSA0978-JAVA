 class StringEqualityExample {
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog.";
        String str2 = "The quick brown fox jumps over the lazy dog.";
        
        boolean isEqual = str1.equals(str2);
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Are the strings equal? " + isEqual);
    }
}