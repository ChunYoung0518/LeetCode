public class ReformatPhoneNumber {

    public static String DASH = "-";
    public static String SPACE = " ";


    public static void main(String[] args) {
        reformatNumber("--17-5 229 35-39475 ");
    }

    public static String reformatNumber(String number) {
        number = number.replaceAll(DASH, "");
        number = number.replaceAll(SPACE, "");

        char[] numbers = number.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<numbers.length) {
            if(numbers.length-i == 2){
                sb.append(numbers[i++]);
                sb.append(numbers[i++]);
            } else if (numbers.length-i == 4) {
                sb.append(numbers[i++]);
                sb.append(numbers[i++]);
                sb.append(DASH);
                sb.append(numbers[i++]);
                sb.append(numbers[i++]);
            } else if (numbers.length-i>=3){
                sb.append(numbers[i++]);
                sb.append(numbers[i++]);
                sb.append(numbers[i++]);
                if(i!=numbers.length) {
                    sb.append(DASH);
                }
            }
        }
        return sb.toString();

    }
}
