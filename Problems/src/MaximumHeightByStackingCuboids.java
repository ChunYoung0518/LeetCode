import java.util.Arrays;

public class MaximumHeightByStackingCuboids {

    public static void main(String[] args) {
        int[][] arr = {{34,29,33},{7,25,75},{31,15,68},{80,80,38},{72,21,30},{2,66,25},{59,36,6},{39,48,95},{35,85,71},{17,14,78}};
        int res = maxHeight(arr);
    }

    public static int maxHeight(int[][] cuboids) {
        for(int[] cuboid : cuboids) {
            Arrays.sort(cuboid);
        }
        Arrays.sort(cuboids, (c1, c2) -> {
            if(c2[0]!=c1[0]) {
                return c2[0]-c1[0];
            }
            if(c2[1]!=c1[1]) {
                return c2[1]-c1[1];
            }
            return c2[2]-c1[2];
        });

        int res = 0;
        int[] dp = new int[cuboids.length];

        for(int i = 0; i<cuboids.length; i++) {
            int length = Integer.MAX_VALUE;
            int width = Integer.MAX_VALUE;
            int height = 0;
            for(int j = i; j<cuboids.length; j++) {
                if((cuboids[j][0]<=length && cuboids[j][1]<=width) || (cuboids[j][0]<=width && cuboids[j][1]<=length)) {
                    height+=cuboids[j][2];
                    length = cuboids[j][0];
                    width = cuboids[j][1];
                }
            }
            res = Math.max(res, height);
            dp[i] = height;
        }

        return res;
    }

}
