class capital 
{
     boolean detectCapitalUse(String word) {
        int n = word.length();
        if(n == 1) {
            return true;
        }
        boolean firstCap = Character.isUpperCase(word.charAt(0));
        boolean secondCap = Character.isUpperCase(word.charAt(1));
        if(firstCap && secondCap) {
            for(int i = 2; i < n; i++) {
                if(Character.isLowerCase(word.charAt(i))) {
                    return false;
                }
            }
        } else {
            for(int i = 1; i < n; i++) {
                if(Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}