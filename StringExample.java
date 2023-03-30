class StringExample {
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog.";
        String str2 = "The brown fox";
        
        if (str1.contains("fox")) {
            System.out.println("String str1 contains the word 'fox'.");
        } else {
            System.out.println("String str1 does not contain the word 'fox'.");
        }
        
        if (str2.contains("fox")) {
            System.out.println("String str2 contains the word 'fox'.");
        } else {
            System.out.println("String str2 does not contain the word 'fox'.");
        }
    }
}