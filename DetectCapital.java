import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public boolean detectCapitalUse(String word) {

        Pattern upperFirst = Pattern.compile("^[A-Z][a-z]*$", Pattern.CASE_INSENSITIVE);
        Pattern upperAll = Pattern.compile("^[A-Z]+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = upperFirst.matcher(word);
        boolean matchFound = false;

        if (matchFound = matcher.find()) {
          
        } else {
            matcher = upperAll.matcher(word);
            matchFound = matcher.find();

        }
        
        return matchFound;
        
    }
}
