 class StringEndsWithExample {
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog.";
        String str2 = "lazy dog.";
        
        if (str1.endsWith(str2)) {
            System.out.println("String str1 ends with the contents of string str2.");
        } else {
            System.out.println("String str1 does not end with the contents of string str2.");
        }
    }
}