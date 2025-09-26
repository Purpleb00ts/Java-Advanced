import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Consumer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        java.util.function.Consumer<String> printString = (System.out::println);

        Arrays.stream(input).forEach(printString);
    }
}
