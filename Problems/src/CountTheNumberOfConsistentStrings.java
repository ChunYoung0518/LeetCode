public class CountTheNumberOfConsistentStrings {

    public static void main(String[] args) {
        String[] words = {"ad","bd","aaab","baa","badab"};
        int res = countConsistentStrings( "ab", words);
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        for(String word : words) {
            for(String s : word.split("")){
                if(!allowed.contains(s)) {
                    count --;
                    break;
                }
            }
        }
        return count;
    }

}
