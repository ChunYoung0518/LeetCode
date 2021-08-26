import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RearrangeSpacesBetweenWords {

    public static void main(String[] args) {
        reorderSpaces("a b   c d ");
    }

    public static String reorderSpaces(String text) {
        List<String> words = Stream.of(text.split(" ")).filter(word -> !"".endsWith(word)).collect(Collectors.toList());
        int space = 0;
        for(char c : text.toCharArray()) {
            if(' ' == c) {
                space ++;
            } else {

            }
        }

        if(space == 0) {
            return text;
        }

        String spacer = "";
        String extraSpacer = "";
        int between = space;
        int spaceLeft = 0;
        if(words.size()>1 && space!=0) {
            between = space/(words.size()-1);
            spaceLeft = space - (words.size()-1)*between;
        }
        for(int i = 0; i < between; i++) {
            spacer += " ";
        }
        for(int i = 0; i < spaceLeft; i++) {
            extraSpacer += " ";
        }


        String res = "";
        if(words.size()>1) {
            res = words.stream().collect(Collectors.joining(spacer));
        } else {
            res = words.get(0) + spacer;
        }

        if(spaceLeft !=0 ){
            res += extraSpacer;
        }

        return res;
    }

}
