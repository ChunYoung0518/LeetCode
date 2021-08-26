public class CreateTargetArrayInTheGivenOrder {

    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4};
        int[] arr2 = {0,1,2,2,1};
        int[] res = createTargetArray(arr1, arr2);

    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        //reset the index: after this the index indicates the real index of each number

        for(int i = 1; i< index.length; i++) {
            for(int j = 0; j < i; j++) {
                if(index[j] >= index[i]) {
                    index[j] ++;
                }
            }
        }

        // System.out.println(Arrays.toString(index));

        int[] res = new int[nums.length];
        for(int i = 0; i<index.length; i++) {
            res[index[i]] = nums[i];
        }

        return res;
    }

}
