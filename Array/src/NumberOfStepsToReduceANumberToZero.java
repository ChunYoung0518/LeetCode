public class NumberOfStepsToReduceANumberToZero {

    public static void main(String[] args) {
        int i = numberOfStepsBi(14);
        System.out.println(i);
    }

    public static int numberOfSteps (int num) {
        if(0 == num) {
            return 0;
        } else if(1 == num) {
            return 1;
        } else if(2 == num) {
            return 2;
        } else if( 3 == num){
            return 3;
        } else {
            if(num % 2 == 0){
                return numberOfSteps(num / 2) + 1;
            } else {
                return numberOfSteps(num - 1) + 1;
            }
        }

    }

    public static int numberOfStepsBi (int num){
        return Integer.toBinaryString(num).length() - 1 + Integer.bitCount(num);
    }

}
