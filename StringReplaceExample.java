 class StringReplaceExample {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        String regex = "fox";
        String replacement = "cat";
        
        String result = str.replaceAll(regex, replacement);
        
        System.out.println("Original string: " + str);
        System.out.println("Replaced string: " + result);
    }
}