import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class OperationsStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] input = scanner.nextLine().split(" ");

        int n = Integer.parseInt(input[0]);

        int s = Integer.parseInt(input[1]);

        int x = Integer.parseInt(input[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        String[] numbers = scanner.nextLine().split("\\s+");

        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(numbers[i]));
        }
        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if(stack.isEmpty()){
            System.out.println(0);
            return;
        }

        int size = stack.size();

        if(stack.contains(x)){
            System.out.println("true");
        }
        else{
            for (int i = 0; i < size; i++) {
                queue.offer(stack.pop());
            }
            System.out.println(queue.poll());
        }
    }
}
