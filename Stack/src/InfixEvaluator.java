import java.util.Stack;

public class InfixEvaluator {

    public static String getAnswer(String Infix){

        Stack<String> operatorStack = new Stack<>();

        String[] var = Infix.split(" ");

        StringBuilder PostFix = new StringBuilder();

        for (String s: var){
            try {
                int num = Integer.parseInt(s);
                PostFix.append(s + " ");
            }
            catch (Exception e){
                if (operatorStack.empty()){
                    operatorStack.push(s);
                }
                else {

                    String var1 = s;
                    String var2 = operatorStack.peek();

                    int newOper = getValue(var1);
                    int topStack = getValue(var2);

                    if (newOper > topStack || topStack == 5) {
                        operatorStack.push(var1);
                    } else if (newOper <= topStack) {
                        PostFix.append(operatorStack.pop() + " ");
                        if (newOper == -1){
                            operatorStack.pop();
                        }
                        else {
                            operatorStack.push(var1);
                        }
                    }
                }
            }
        }

        for (int x = 0; x <= operatorStack.size(); x++){
            PostFix.append(operatorStack.pop() + " ");
        }

        return PostFix.toString();

    }

    private static int getValue(String str){

        int ans = 0;

        if (str.equals("*")){
            ans = 4;
        }
        else if (str.equals("/")){
            ans = 3;
        }
        else if (str.equals("+")){
            ans = 2;
        }
        else if (str.equals("-")){
            ans = 1;
        }
        else if (str.equals("(")){
            ans = 5;
        }
        else if (str.equals(")")){
            ans = -1;
        }

        return ans;

    }

}
