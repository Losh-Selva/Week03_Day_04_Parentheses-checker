import java.util.Stack;

public class ParenthesesChecker {
    public static void main(String[] args) {
        System.out.println(checkParentheses("test braces}"));

    }


        public static boolean checkParentheses (String string) {
            Stack<String> checkStack = new Stack<>();
            int openBracketCounter= 0;
            int closedBracketCounter= 0;
        for (int i = 0; i < string.length(); i++){
            //MVP METHOD
           /* if (String.valueOf(string.charAt(i)).equals("(")
                    || String.valueOf(string.charAt(i)).equals("{")
                    || String.valueOf(string.charAt(i)).equals("[")
                    || String.valueOf(string.charAt(i)).equals("<")){
                openBracketCounter++;
            } else if (String.valueOf(string.charAt(i)).equals(")")
                    || String.valueOf(string.charAt(i)).equals("}")
                    || String.valueOf(string.charAt(i)).equals("]")
                    || String.valueOf(string.charAt(i)).equals(">")) {
                closedBracketCounter++;
            }*/

            //MVP WITH EXTENSIONS
            switch (String.valueOf(string.charAt(i))){
                case "(" :
                    checkStack.push(")");
                    break;
                case "{":
                    checkStack.push("}");
                    break;
                case "<" :
                    checkStack.push(">");
                    break;
                case "[" :
                    checkStack.push("]");
                    break;
                case ")" :
                    if( checkStack.size() ==0) {
                        checkStack.push("]") ;
                    } else if (checkStack.peek() == ")") {
                        checkStack.pop();;
                    }
                    break;
                case "}" :
                    if( checkStack.size() ==0) {
                        checkStack.push("]") ;
                    } else if (checkStack.peek() == "}") {
                        checkStack.pop();;
                    }
                    break;
                case ">" :
                    if( checkStack.size() ==0) {
                        checkStack.push("]") ;
                    } else if (checkStack.peek() == ">") {
                        checkStack.pop();;
                    }
                    break;
                case "]" :
                    if( checkStack.size() ==0) {
                        checkStack.push("]") ;
                    } else if (checkStack.peek() == "]") {
                        checkStack.pop();;
                    }
                    break;
                default:
                    break;
            }
        }
        return checkStack.size() == 0;
    }
}