import java.util.Stack;
import java.util.Scanner;

public class test3 {
    public static String checkBalancedBracket(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return "NO";
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return "NO";
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Sampel 1");
        System.out.print("input: ");
        String input1 = scanner.nextLine();
        System.out.println("Output: " + checkBalancedBracket(input1));
        System.out.println();

        System.out.println("Sampel 2");
        System.out.print("input: ");
        String input2 = scanner.nextLine();
        System.out.println("Output: " + checkBalancedBracket(input2));
        System.out.println();

       System.out.println("Sampel 3");
        System.out.print("input: ");
        String input3 = scanner.nextLine();
        System.out.println("Output: " + checkBalancedBracket(input3));
    }
}
