public class MaximumRepeatingSubstring {

    public static void main(String[] args) {

        int res = maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba",
            "aaaba");
    }

    public static int maxRepeating(String sequence, String word) {
        int count = 0;
        String match = word;
        while(sequence.contains(match)){
            count++;
            match += word;
        }
        return count;
    }


}
