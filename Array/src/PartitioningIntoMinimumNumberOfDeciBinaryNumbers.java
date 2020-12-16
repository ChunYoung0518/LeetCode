public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public static void main(String[] args) {
        int res = minPartitions("32");
    }

    public static int minPartitions(String n) {
        int res = 0;
        for(char i : n.toCharArray()) {
            res = Math.max(i-'0', res);
        }
        return res;
    }
}
