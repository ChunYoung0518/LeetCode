public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 3 };
        int pairs = numIdenticalPairs(arr);
    }

    public static int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        for (int i : nums) {
            count[i]++;
        }
        //System.out.println(Arrays.toString(count));

        int pairs = 0;
        for (int i : count) {
            if(0 != i){
                pairs += (i * (i - 1) / 2);
            }
        }
        return pairs;
    }
    
}
