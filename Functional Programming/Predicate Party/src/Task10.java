import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> predicate;

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String commands = scanner.nextLine();

        while(!commands.equals("Party!")){
            String[] command = commands.split("\\s+");

            if(command[1].equals("StartsWith")){
                predicate = s -> s.startsWith(command[2]);
            } else if (command[1].equals("EndsWith")) {
                predicate = s -> s.endsWith(command[2]);
            } else {
                predicate = s -> s.length() == Integer.parseInt(command[2]);
            }


            if(command[0].equals("Remove")){
                guests.removeIf(predicate);
            } else if (command[0].equals("Double")) {
                List<String> doubleGuests = guests.stream().filter(predicate).collect(Collectors.toList());
                guests.addAll(doubleGuests);
            }

            commands = scanner.nextLine();
        }
        if(guests.isEmpty()){
            System.out.println("Nobody is going to the party!");
        } else{
            String result = guests.stream().sorted().collect(Collectors.joining(", ")) + " are going to the party!";
            System.out.println(result);
        }
    }
}
