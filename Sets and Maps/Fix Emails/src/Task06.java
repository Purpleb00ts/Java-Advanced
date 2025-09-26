import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("search")){
            String[] person = input.split("-");

            String name = person[0];
            String number = person[1];

            phonebook.put(name, number);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while(!input.equals("stop")){
            if(phonebook.containsKey(input)){
                System.out.printf(input + " -> " + phonebook.get(input) + "%n");
            }
            else{
                System.out.printf("Contact %s does not exist.%n", input);
            }

            input = scanner.nextLine();
        }
    }
}
