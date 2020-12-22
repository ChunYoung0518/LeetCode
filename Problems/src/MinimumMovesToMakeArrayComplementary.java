import java.util.HashMap;
import java.util.Map;

public class MinimumMovesToMakeArrayComplementary {

    public static void main(String[] args) {
//        int[] nums = {28,50,76,80,64,30,32,84,53,8};
//        int res = minMoves(nums, 84);

        int[] nums = {1,2,4,3};
        int res = minMoves(nums, 4);
    }



    public static int minMoves(int[] nums, int limit) {

        int length = nums.length;
        int[] segments = new int[limit*2+2];
        Map<Integer, Integer> sums = new HashMap<>();

        for( int i = 0; i< nums.length/2; i++) {
            if(sums.keySet().contains(nums[i] + nums[length-1-i])){
                sums.put(nums[i] + nums[length-1-i], sums.get(nums[i] + nums[length-1-i]) + 1);
            } else {
                sums.put(nums[i] + nums[length-1-i], 1);
            }
            int a = Math.min(nums[i], nums[length-1-i]);
            int b = Math.max(nums[i], nums[length-1-i]);
            segments[a+1]--;
            segments[b+limit+1]++;
        }

        if(sums.keySet().size() == 1) {
            return 0;
        }

        int change = length;
        int res = change;

        for(int i=2; i<segments.length; i++) {
            change = change + segments[i] - sums.getOrDefault(i, 0) + sums.getOrDefault(i-1, 0);
            res = Math.min(res, change);
        }

        return res;

    }
}
