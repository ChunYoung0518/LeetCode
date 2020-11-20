public class ShuffleTheArray {

    public static void main(String[] args) {
        int[] input = {2,5,1,3,4,7};
        int[] res = shuffle(input, 3);
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int i = 0;
        int j = 0;
        while(i<n){
            res[j] = nums[i];
            res[j+1] = nums[i+n];
            i++;
            j+=2;
        }
        return res;
    }
}
