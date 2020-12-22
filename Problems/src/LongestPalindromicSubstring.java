public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String res = longestPalindrome("babad");
    }


    public static String longestPalindrome(String s) {

        int length = s.length();
        boolean[][] isPalindrome = new boolean[length][length];

        int start = 0;
        int end = 0;

        for(int i = 0; i<length; i++) {
            isPalindrome[i][i] = true;
            if(i < length-1 && s.charAt(i) == s.charAt(i+1)){
                isPalindrome[i][i+1] = true;
                start = i;
                end = i+1;
            }
        }

        for(int len = 3; len <= length; len ++ ) {
            for(int i = 0; i<= length - len; i++) {
                if(s.charAt(i) == s.charAt(i+len-1) && isPalindrome[i+1][i+len-2]){
                    isPalindrome[i][i+len-1] = true;
                    start = i;
                    end = i+len-1;
                }
            }
        }

        return s.substring(start, end+1);


    }
}
