 class TrimExample {
    public static void main(String[] args) {
        String str = "    The quick brown fox jumps over the lazy dog.    ";
        
        String trimmed = str.trim();
        
        System.out.println("Original string: \"" + str + "\"");
        System.out.println("Trimmed string: \"" + trimmed + "\"");
    }
}