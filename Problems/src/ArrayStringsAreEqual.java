public class ArrayStringsAreEqual {

    public static void main(String[] args) {
        String[] arr1 = {"ab", "c"};
        String[] arr2 = {"a", "bc"};
        boolean b = arrayStringsAreEqual(arr1, arr2);
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        for(String s1 : word1){
            w1.append(s1);
        }
        for(String s2 : word2){
            w2.append(s2);
        }
        // System.out.println(w1);
        // System.out.println(w2);
        return w1.toString().equals(w2.toString());
    }
}
