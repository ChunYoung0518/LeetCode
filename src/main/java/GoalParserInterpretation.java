public class GoalParserInterpretation {

    public static void main(String[] args) {
        String res = interpret("(al)G(al)()()G");
    }

    public static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
