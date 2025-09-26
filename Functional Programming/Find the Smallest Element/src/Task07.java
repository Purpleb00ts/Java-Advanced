import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(input);

        Function<List<Integer>, Integer> findMin = a -> a.stream().min(Integer::compare).get();

        System.out.println(input.size() - 1 - input.indexOf(findMin.apply(input)));
    }
}
