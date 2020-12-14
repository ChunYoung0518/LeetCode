public class CountOfMatchesInTournament {

    public static void main(String[] args) {
        int res = numberOfMatches(17);
    }

    public static int numberOfMatches(int n) {
        if(1 == n) {
            return 0;
        } else if (2 == n) {
            return 1;
        } else if(n %2 == 1) {
            return numberOfMatches((n-1)/2 + 1) + (n-1)/2;
        } else {
            return n/2 + numberOfMatches(n/2);
        }
    }
}
