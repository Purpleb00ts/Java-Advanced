import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> emails = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            String email = scanner.nextLine();

            emails.putIfAbsent(input, email);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : emails.entrySet()) {
            String domain = entry.getValue().substring(entry.getValue().lastIndexOf('.') + 1, entry.getValue().length());
            if (!domain.equals("com") && !domain.equals("uk") && !domain.equals("us")) {
                System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
