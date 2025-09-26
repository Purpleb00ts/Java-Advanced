import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicOPqueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        String[] numbers = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            queue.offer(Integer.parseInt(numbers[i]));
        }

        for (int i = 0; i < s; i++) {
            queue.poll();
        }

        if(queue.isEmpty()){
            System.out.println(0);
            return;
        }

        if(queue.contains(x)){
            System.out.println("true");
        }
        else {
            System.out.println(Collections.min(queue));
        }
    }
}
