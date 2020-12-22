public class XOROperationInAnArray {

    public static void main(String[] args) {
        int res = xorOperation(5, 0);
    }

    public static int xorOperation(int n, int start) {
        int res = start;
        for(int i = 1; i<n; i++) {
            res = res ^ (start + 2 * i);
        }
        return res;
    }
}
