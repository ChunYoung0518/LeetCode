public class MaximumNestingDepthOfTheParentheses {

    public static void main(String[] args) {
        int res = maxDepth("(1+(2*3)+((8)/4))+1");

    }

    public static int maxDepth(String s) {
        int count = 0;
        int max = 0;
        for(int i = 0; i<s.length(); i++){
            if('('== s.charAt(i)){
                count ++;
                max  = Math.max(count, max);
            } else if (')' == s.charAt(i)){
                count --;
            }
        }
        return max;
    }


    public static int maxDepthString(String s) {
        int count = 0;
        int max = 0;
        for(String string : s.split("")){
            if("(".equals(string)){
                count ++;
                max  = Math.max(count, max);
            } else if (")".equals(string)){
                count --;
            }
        }
        return max;
    }
}
