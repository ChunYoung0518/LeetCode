public class JewelsAndStones {

    public static void main(String[] args) {
        int b = numJewelsInStones("aA", "aAAbbbb");
    }

    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        String[] individualStons = S.split("");
        for(String stone : individualStons) {
            if(J.contains(stone)){
                count++;
            }
        }
        return count;

    }

}
