 class SubstringExample {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        int startIndex = 16;
        int endIndex = 19;
        
        String substring = str.substring(startIndex, endIndex);
        
        System.out.println("Original string: " + str);
        System.out.println("Substring between " + startIndex + " and " + endIndex + ": " + substring);
    }
}