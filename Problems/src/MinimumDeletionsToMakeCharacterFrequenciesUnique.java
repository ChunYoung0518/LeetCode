import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinimumDeletionsToMakeCharacterFrequenciesUnique {

    public static void main(String[] args) {
        int res = minDeletions("bbcebab");
    }

    public static int minDeletions(String s) {

        int[] frequency = new int[26];
        for(char c : s.toCharArray()) {
            frequency[c-'a']++;
        }

        Arrays.sort(frequency);
        int res = 0;
        Set<Integer> frequencyAlreadyAppeared = new HashSet<>();

        for(int i = 0; i<frequency.length; i++) {
            if(0 == frequency[i]) {
                continue;
            }

            if(!frequencyAlreadyAppeared.isEmpty() && frequencyAlreadyAppeared.contains(frequency[i])) {
                while(frequencyAlreadyAppeared.contains(frequency[i]) && 0 != frequency[i]) {
                    frequency[i]--;
                    res++;
                }

            }
            frequencyAlreadyAppeared.add(frequency[i]);
        }
        return res;
    }

}
