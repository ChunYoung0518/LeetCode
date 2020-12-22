public class FibonacciNumber {

    public static void main(String[] args) {
        fib(7);
    }

    public static int fib(int n) {
        int i = 0;
        int j = 1;

        if(n == 0) {
            return i;
        } else if(n == 1) {
            return j;
        } else {
            while(n >=3){
                int tmp = i+j;
                i=j;
                j=tmp;
                n--;
            }
            return i+j;
        }

    }

}
