public class ToLowerCase {

    public static void main(String[] args) {
        String res =  toLowerCase("JAVA");
    }

    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();

        int start = 'a';

        for(char c : str.toCharArray()) {
            if(c>='A' && c<='Z') {
                sb.append((char) (start+ (c-'A')));
            } else {
                sb.append(c);
            }

        }
        return sb.toString();
    }

}
