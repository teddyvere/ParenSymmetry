
public class ParenSymmetry {


    private Boolean isBalanced(String s) {
        // implement this method
        int counter1 = 0;
        int counter2 = 0;


        for (int i = 0; i <= s.length(); i++) {
            if (s.charAt(i) == ('(')) {
                counter1 += 1;
            } else {
                if (s.charAt(i) == (')')) {
                    counter2 += 1;
                } else {
                    return null;
                }
            }
        }
        if (counter1 == counter2) {
            return true;
        } else {
            return false;
        }

    }
    private void checkFile(String filename) {
        // open file named filename

        // for each line in the file
            // read the line
            // print whether or not the line's parenthesis are balanced

        // CLOSE the file
    }

    public static void main(String[] args) {
        ParenSymmetry ps = new ParenSymmetry();

        Boolean b0 = ps.isBalanced("()");
        printResult(b0, true);

        String[] falseStrings = {"(", "((", ")", "", "(()())((())))"};
        Boolean falses = true;
        for (String strToTest : falseStrings) {
            falses = ps.isBalanced(strToTest);
        }
        printResult(falses, false);

        String[] trueStrings = {"()", "(())", "(((())))", "", "(()())((()))", "(   )", "( () ( ) )"};
        Boolean trues = false;
        for (String strToTest : trueStrings) {
            trues = ps.isBalanced(strToTest);
        }
        printResult(trues, true);

    }

    private static void printResult(Boolean b0, boolean b) {
        if (b0 == null) {
            System.out.println("Null Failure");
            return;
        }
        if (b0 == b) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }
}
