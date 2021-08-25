public class ReverseInteger {

    static public int reverse(int x) {
        if (0 == x) {
            return 0;
        }
        char[] arry = String.valueOf(Math.abs(x)).toCharArray();

        if (arry.length == 10 && arry[arry.length - 1]-'0' > 2) {
            return 0;
        }
        int res = 0;
        int digit = 1;
        for (int i = 0; i < arry.length; i++) {
            System.out.println("-------------");
            System.out.println(res);
            System.out.println(digit * (arry[i] - '0'));
            if(2147483647 - res < digit * (arry[i] - '0')) {
                return 0;
            }
            res += (digit * (arry[i] - '0'));
            System.out.println(res);
            digit *= 10;
        }
        return x > 0 ? res : (0 - res);
    }

    public void main(String[] args) {
        System.out.println(reverse(-2147483412));
        //1534236469 - 0
    }

}
