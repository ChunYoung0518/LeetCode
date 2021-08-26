public class ReverseString {

    public static void main(String[] args) {
        char[] arr = {'H','a','n','n','a','h'};
        reverseString(arr);
    }

    public static void reverseString(char[] s) {
        char tmp;
        int i=0;
        int j=s.length-1;
        while(i<j) {
            tmp = s[i];
            s[i]=s[j];
            s[j]=tmp;
            i++;
            j--;
        }
    }

}
