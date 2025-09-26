import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> chemicalElements = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] elements = input.split(" ");
            for (String e : elements) {
                if(!chemicalElements.contains(e)){
                    chemicalElements.add(e);
                }
            }
        }

        for (String element : chemicalElements) {
            System.out.print(element + " ");
        }
    }
}
