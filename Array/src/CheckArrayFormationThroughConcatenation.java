import java.util.HashMap;
import java.util.Map;

public class CheckArrayFormationThroughConcatenation {

    public static void main(String[] args) {
        int[] arr = {91,4,64,78};
        int[][] pieces = {{78},{4,64},{91}};
        boolean res = canFormArray(arr, pieces);
    }

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> piecesStart = new HashMap<>();
        for(int i = 0; i<pieces.length; i++) {
            piecesStart.put(pieces[i][0], pieces[i]);
        }

        int index = 0;
        while(index < arr.length){
            if(piecesStart.keySet().contains(arr[index])) {
                int[] piece = piecesStart.get(arr[index]);
                for( int i = 0; i<piece.length; i++) {
                    if(piece[i] != arr[index]) {
                        return false;
                    }
                    if(i<piece.length-1){
                        index++;
                    }
                }
            } else {
                return false;
            }
            index ++;
        }
        return true;
    }

}
