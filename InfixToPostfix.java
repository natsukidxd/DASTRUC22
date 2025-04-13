import javax.swing.JOptionPane;

public class InfixToPostfix {

    public static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2; // * and / have higher precedence.
        } else if (ch == '^') {
            return 3;
        }
        return 0;
    }

    public static String convertToPostfix(String infix) {
        MyNodeStack operators = new MyNodeStack();
        String postFix = "";

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                postFix += ch;
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (!operators.isEmpty() && (Character)operators.peek() != '(') {
                    postFix += (Character)operators.peek();
                    operators.pop();
                }
                if (!operators.isEmpty() && (Character)operators.peek() == '(') {
                    operators.pop(); // remove '('
                }
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                while (!operators.isEmpty() &&
                       (Character)operators.peek() != '(' &&
                       precedence(ch) <= precedence((Character)operators.peek())) {
                    postFix += (Character)operators.peek();
                    operators.pop();
                }
                operators.push(ch);
            }
        }

        // Pop remaining operators
        while (!operators.isEmpty()) {
            postFix += (Character)operators.peek();
            operators.pop();
        }

        return postFix;
    }


    public static void main(String args[]) {
        //String infix = "((a+(b*c))-d)";
        String infix = JOptionPane.showInputDialog("Enter an infix expression.");
        String result = convertToPostfix(infix);
        //System.out.println("The Postfix of the given Infix Expression is: " + result);
        JOptionPane.showMessageDialog(null, "Infix expression: " + infix + "\nPistfix expression: "+ result);
    }
}
