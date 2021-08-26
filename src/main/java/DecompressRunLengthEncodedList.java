public class DecompressRunLengthEncodedList {

    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        int[] res = decompressRLElist(input);
    }

    public static int[] decompressRLElist(int[] nums) {
        //record the freq and values
        int pairs = nums.length/2;
        int length = 0;
        for(int i = 0; i<pairs; i++) {
            length += nums[2*i];
        }
        int[] res = new int[length];
        int index = 0;

        // for(int i = 0; i<pairs; i++){
        //     for(int freq = 1; freq <= nums[2*i]; freq++){
        //         res[index++] = nums[2*i+1];
        //     }
        // }

        int freqIndex = 0;
        while(index < length){
            res[index++] = nums[freqIndex+1];
            nums[freqIndex]--;
            if(nums[freqIndex] == 0) {
                freqIndex += 2;
            }
        }

        return res;
    }

}
