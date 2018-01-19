import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            String text = in.nextLine();

            String var = InfixEvaluator.getAnswer(text);

            System.out.println(InfixEvaluator.getAnswer(text));

            System.out.println(PostfixEvaluator.calculateAnswer(var));

        }

    }
}
