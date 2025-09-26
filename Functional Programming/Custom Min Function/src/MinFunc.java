import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class MinFunc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Integer[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Function<Integer[], Integer> minNumber = a -> Arrays.stream(a).min(Integer::compare).get();

        System.out.println(minNumber.apply(input));
    }
}
