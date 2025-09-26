import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Map<String, Predicate<String>> filters = new HashMap<>();

        Predicate<String> predicate;

        String commands = scanner.nextLine();

        while(!commands.equals("Print")){
            String[] command = commands.split(";");
            String filterName = commands.substring(4);
            String removeName = commands.substring(7);
            String addOrRemove = command[0];
            String condition = command[1];
            String criteria = command[2];

            if(addOrRemove.equals("Add filter")){
                switch (condition){
                    case "Starts with":
                        predicate = s -> s.startsWith(criteria);
                        filters.put(filterName, predicate);
                        break;
                    case "Ends with":
                        predicate = s -> s.endsWith(criteria);
                        filters.put(filterName, predicate);
                        break;
                    case "Length":
                        predicate = s -> s.length() == Integer.parseInt(criteria);
                        filters.put(filterName, predicate);
                        break;
                    case "Contains":
                        predicate = s -> s.contains(criteria);
                        filters.put(filterName, predicate);
                        break;
                }
            } else if (addOrRemove.equals("Remove filter")) {
                filters.remove(removeName);
            }


            commands = scanner.nextLine();
        }

        for (String name : names) {
            boolean isGoing = true;
            for (String entry : filters.keySet()) {
                if(filters.get(entry).test(name)){
                    isGoing = false;
                    break;
                }
            }
            if(isGoing){
                System.out.print(name + " ");
            }
        }
    }
}
