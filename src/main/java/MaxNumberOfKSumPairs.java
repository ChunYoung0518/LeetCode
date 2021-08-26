import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfKSumPairs {

    public static void main(String[] args) {
        int[] nums = {3,1,3,4,3};
        int res = maxOperations(nums, 6);
    }

    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> numsAndCount = new HashMap<>();

        for(int num : nums) {
            if(!numsAndCount.keySet().contains(num)) {
                numsAndCount.put(num, 1);
            } else {
                numsAndCount.put(num, numsAndCount.get(num) + 1);
            }
        }


        int count = 0;
        for(Integer i : numsAndCount.keySet()) {
            if(i != k-i && numsAndCount.keySet().contains(k-i) && numsAndCount.get(i) != 0 && numsAndCount.get(k-i) !=0){
                int pair = Math.min(numsAndCount.get(i), numsAndCount.get(k-i));
                count += pair;
                numsAndCount.put(i, numsAndCount.get(i) - pair);
                numsAndCount.put(k-i, numsAndCount.get(k-i) - pair);
            } else if (i == k-i) {
                while (numsAndCount.get(i) >= 2) {
                    count ++;
                    numsAndCount.put(i, numsAndCount.get(i) - 2);
                }
            }
        }

        return count;
    }

}
