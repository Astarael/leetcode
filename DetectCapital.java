class Solution {
    public boolean detectCapitalUse(String word) {

        String upperFirst = "^[A-Z]([a-z]*)$";
        String upperAll = "^[A-Z]+$";
        String lowerAll = "^[a-z]+$";
        boolean matchFound = false;
        

        if (word.matches(upperFirst)) {

            matchFound = true;

        } else if (word.matches(upperAll)) {
            
            matchFound = true;

        } else if (word.matches(lowerAll)) {
            
            matchFound = true;

        }
        
        return matchFound;
    }
}
