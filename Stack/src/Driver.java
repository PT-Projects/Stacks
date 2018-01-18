import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            String text = in.nextLine();

            String var = InfixEvaluator.createPostfix(text);

            System.out.println(InfixEvaluator.createPostfix(text));

            System.out.println(PostfixEvaluator.calculateAnswer(var));

        }

    }
}
