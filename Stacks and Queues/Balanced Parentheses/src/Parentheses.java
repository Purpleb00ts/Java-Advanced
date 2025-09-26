import java.util.ArrayDeque;
import java.util.Scanner;

public class Parentheses {
    static boolean balanced(String input){
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)){
                case ')':
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(stack.pop() != '('){
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(stack.pop() != '{'){
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(stack.pop() != '['){
                        return false;
                    }
                    break;
                default:
                    stack.push(input.charAt(i));
                    break;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();

        if(balanced(input)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
