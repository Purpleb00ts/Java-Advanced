import java.util.ArrayDeque;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();

        String[] numbers = input.split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < numbers.length; i++) {
            stack.push(Integer.parseInt(numbers[i]));
        }

        for (int e: stack) {
            System.out.printf(stack.pop() + " ");
        }
    }
}
