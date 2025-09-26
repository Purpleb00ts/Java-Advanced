import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TAsk06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());



        Predicate<String> checkLength = a -> a.length() <= length;

        Arrays.stream(scanner.nextLine().split(" "))
                .filter(checkLength)
                .forEach(System.out::println);


    }
}
