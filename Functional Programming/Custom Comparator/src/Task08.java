import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Predicate<Integer> checkIfOdd = a -> a % 2 == 1;
        Predicate<Integer> checkIfEven = a -> a % 2 == 0;

        Comparator<Integer> customComparator = ((first, second) -> {
            if(first % 2 == 0 && second % 2 != 0){
                return -1;
            } else if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            } else{
                return first.compareTo(second);
            }
        });

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(customComparator)
                .forEach(e -> System.out.print(e + " "));

    }
}
