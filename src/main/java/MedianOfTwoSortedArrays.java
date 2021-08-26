public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        double res = findMedianSortedArrays(arr1, arr2);

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        if(1 == totalLength) {
            return nums1.length == 1 ? nums1[0] : nums2[0];
        }

        boolean even = (totalLength % 2 == 0);
        int mid = totalLength / 2;

        double number1 = 0;
        double number2 = 0;

        int index1 = 0;
        int index2 = 0;
        int count = 0;
        int tmp = 0;

        while((index1 < nums1.length || index2 < nums2.length)){

            if(index2 == nums2.length || (index1 < nums1.length && nums1[index1] <= nums2[index2])){
                tmp = nums1[index1];
                index1 ++;
            } else if(index1 == nums1.length || (index2 < nums2.length  && nums2[index2] <= nums1[index1])) {
                tmp = nums2[index2];
                index2 ++;
            }
            count ++;

            if(count == mid && even){
                number1 = tmp;
            }

            if(count == (mid +1)){
                number2 = tmp;
                break;
            }
        }

        double res = even ? ((number1 + number2) / 2) : (number1 + number2);
        return res;

    }

}
