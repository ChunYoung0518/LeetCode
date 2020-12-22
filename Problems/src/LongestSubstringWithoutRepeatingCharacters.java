import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        int res = lengthOfLongestSubstring("abcbbcbb");

    }

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> longestSet = new HashSet<>();
        int start = 0;
        int end = 0;
        int res = 0;

        while(end < s.length()){
            if(!longestSet.contains(s.charAt(end))) {
                longestSet.add(s.charAt(end++));
                res = Math.max(res, longestSet.size());
            } else {
                longestSet.remove(s.charAt(start++));
            }

        }

        return res;
    }


}
