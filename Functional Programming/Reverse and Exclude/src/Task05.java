import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arr = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(arr);

        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> checkIfContains = a -> a % n == 0;

        arr.removeIf(checkIfContains);

        Consumer<List<Integer>> printList = a -> a.stream().forEach(e -> System.out.print(e + " "));

        printList.accept(arr);


    }
}
