public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static void main(String[] args) {
        int res = subtractProductAndSum(234);
    }

    public static int subtractProductAndSum(int n) {
        // String number = (new Integer(n)).toString();
        // //System.out.println(number);
        // String[] numbers = number.split("");
        // Integer product = 1;
        // Integer sum = 0;
        // for(String num : numbers){
        //     product *= (new Integer(num));
        //     sum += (new Integer(num));
        // }
        // return product - sum;

        int product = 1;
        int sum = 0;
        while(n != 0) {
            product *= (n % 10);
            sum += (n % 10);
            n = n / 10;
        }
        return product - sum;
    }
}
