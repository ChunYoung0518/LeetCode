public class GetMaximumInGeneratedArray {

    public static void main(String[] args) {
        getMaximumGenerated(7);
    }

    public static int getMaximumGenerated(int n) {
        int[] res = new int[n+1];
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }

        res[0] = 0;
        res[1] = 1;
        int max = 1;
        for(int i = 1; i<=n/2; i++) {
            res[2*i] = res[i];
            max = Math.max(max, res[2*i]);
            if(2*i+1<=n){
                res[2*i+1] = res[i] + res[i+1];
                max = Math.max(max, res[2*i+1]);
            }
        }
        return max;

    }

}
