public class DefuseTheBomb {

    public static void main(String[] args) {
        int arr[] = {5,7,1,4};
        int[] res = decrypt( arr, 3);
    }

    public static int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        if(0 == k) {
            return res;
        } else if(k > 0) {
            for( int i = 0 ; i < code.length; i++) {
                res[i] = sumOf(code, i, k, true);
            }
        } else {
            for ( int i = code.length -1; i >-1; i--) {
                res[i] = sumOf(code, i, 0-k, false);
            }
        }
        return res;
    }

    private static int sumOf(int[] code, int start, int numbers, boolean forward) {
        int sum = 0;
        while(numbers > 0) {
            if(forward) {
                start++;
                if(start > code.length -1) {
                    start = 0;
                }

            } else {
                start--;
                if(start < 0) {
                    start = code.length-1;
                }
            }
            sum+=code[start];
            numbers--;
        }
        return sum;
    }

}
