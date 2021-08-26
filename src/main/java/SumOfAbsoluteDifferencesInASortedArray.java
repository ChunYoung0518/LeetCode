public class SumOfAbsoluteDifferencesInASortedArray {

    public static void main(String[] args) {
        int[] arr = {1,4,6,8,10};
        int[] res = getSumAbsoluteDifferences(arr);
    }

    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int totalSum = 0;
        for(int num : nums) {
            totalSum+=num;
        }

        int prefixSum = 0;
        int suffixSum = totalSum-nums[0];
        int[] res = new int[nums.length];

        int i = 0;
        while(i<nums.length) {
            res[i] = (2*i-nums.length+1)*nums[i] - prefixSum + suffixSum;
            prefixSum+=nums[i];
            i++;
            if(i<nums.length)
                suffixSum-=nums[i];

        }
        return res;
    }

}
