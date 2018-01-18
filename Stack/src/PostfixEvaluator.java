import java.util.Stack;

public class PostfixEvaluator {

    public static double calculateAnswer(String postfix) {

        Stack<Double> operandStack = new Stack<>();

        String[] var = postfix.split(" ");

        for (String s: var){
            try{
                double num = Integer.parseInt(s);
                operandStack.push(num);
            }
            catch (Exception e){
                double var1 = operandStack.pop();
                double var2 = operandStack.pop();
                double ans = 0;
                if (s.equals("+")){
                    ans = var2 + var1;
                }
                else if (s.equals("*")){
                    ans = var2 * var1;
                }
                else if (s.equals("/")){
                    ans = var2 / var1;
                }
                else if (s.equals("-")){
                    ans = var2 - var1;
                }
                operandStack.push(ans);
            }
        }

        return operandStack.peek();

    }

}
