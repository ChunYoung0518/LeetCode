public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        char[] array = String.valueOf(x).toCharArray();
        int front = 0;
        int end = array.length - 1;
        while (front < end) {
            if(array[front] != array[end]) {
                return false;
            }
            front++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
    }

}
