import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumEl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();


        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            switch (Integer.parseInt(input[0])){
                case 1: stack.push(Integer.parseInt(input[1]));
                break;
                case 2:
                    if(!stack.isEmpty()) {
                        stack.pop();
                    }
                break;
                case 3:
                    if(!stack.isEmpty()) {
                        System.out.println(Collections.max(stack));
                    }
                break;
            }
        }
    }
}
