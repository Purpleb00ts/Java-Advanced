import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int amount = Integer.parseInt(scanner.nextLine());

        Set<String> input = new LinkedHashSet<>();

        for (int i = 0; i < amount; i++) {
            String word = scanner.nextLine();
            if(!input.contains(word)) {
                input.add(word);
            }
        }

        for (String s : input) {
            System.out.println(s);
        }
    }
}
