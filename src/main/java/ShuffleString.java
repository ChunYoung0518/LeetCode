public class ShuffleString {

    public static void main(String[] args) {
        int[] input = {4,5,6,7,0,2,1,3};
        String s = restoreString("codeleet", input);
    }

    public static String restoreString(String s, int[] indices) {
        char[] arr = s.toCharArray();
        char[] res = new char[indices.length];
        for(int i = 0; i < arr.length; i++){
            res[indices[i]] = arr[i];
        }
        return new String(res);
    }

}
