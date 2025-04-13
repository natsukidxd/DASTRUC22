//Ferrer, Krist Dave B.

import java.util.Scanner;

public class ParenthesesCheckerMyNodeStack {

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("INPUT: ");
//        String input = scan.nextLine();
//        String output;
//        
//        if(!input.contains("(") && !input.contains(")")) {
//            output = "No parentheses are found";
//        } else {
//            MyNodeStack myNodeStack = new MyNodeStack();
//            boolean balanced = true;
//            
//            for(int i = 0; i < input.length(); i++) {
//                char charInput = input.charAt(i);
//                
//                if(charInput == '(') {
//                    myNodeStack.push(charInput);
//                } 
//                else if(charInput == ')') {
//                    if(myNodeStack.isEmpty() || (Character)myNodeStack.peek() != '(') {
//                        balanced = false;
//                        break;
//                    }
//                    myNodeStack.pop();
//                }
//            }
//            if(balanced && myNodeStack.isEmpty()) {
//            	output = "Balanced";
//            } else {
//            	output = "Not Balanced";
//            }
//        }
//        
//        System.out.println("OUTPUT: " + output);
//    }
}