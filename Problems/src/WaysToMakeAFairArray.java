public class WaysToMakeAFairArray {

    public static void main(String[] args) {
        int[] input = {6,1,7,4,1};
        int res = waysToMakeFair(input);
    }

    public static int waysToMakeFair(int[] nums) {

        int[] oddSumBefore =  new int[nums.length];
        int[] evenSumBefore = new int[nums.length];

        int oddSum = 0;
        int evenSum = 0;

        for(int i = 0; i<nums.length; i++) {
            oddSumBefore[i] = oddSum;
            evenSumBefore[i] = evenSum;
            if(i%2 == 0){
                evenSum += nums[i];
            } else {
                oddSum += nums[i];
            }
        }

        int[] oddSumAfter =  new int[nums.length];
        int[] evenSumAfter = new int[nums.length];

        oddSum = 0;
        evenSum = 0;
        for(int i = nums.length-1; i>=0; i--) {
            oddSumAfter[i] = oddSum;
            evenSumAfter[i] = evenSum;
            if(i%2 == 0){
                evenSum += nums[i];
            } else {
                oddSum += nums[i];
            }
        }

        int res = 0;
        for(int i = 0; i<nums.length; i++) {
            if(oddSumBefore[i] + evenSumAfter[i] == evenSumBefore[i] + oddSumAfter[i]) {
                res++;
            }
        }

        return res;

    }
}
