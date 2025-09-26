import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        Function<List<Integer>, List<Integer>> add = a -> a.stream().map(e -> e + 1).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> subtract = a -> a.stream().map(e -> e - 1).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> multiply = a -> a.stream().map(e -> e * 2).collect(Collectors.toList());

        Consumer<List<Integer>> printArr = a -> a.forEach(e -> System.out.print(e + " "));

        while(!command.equals("end")){
            if(command.equals("add")){
               input = add.apply(input);
            } else if (command.equals("subtract")){
               input = subtract.apply(input);
            } else if (command.equals("multiply")) {
                input = multiply.apply(input);
            } else if (command.equals("print")) {
                printArr.accept(input);
                System.out.println();
            }
            command = scanner.nextLine();
        }
    }
}
