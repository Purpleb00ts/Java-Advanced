import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> letters = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {

            if(letters.containsKey(input.charAt(i))){
               int amountOfLetters = letters.get(input.charAt(i));
               letters.put(input.charAt(i), amountOfLetters + 1);
            }
            letters.putIfAbsent(input.charAt(i), 1);
        }

        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
