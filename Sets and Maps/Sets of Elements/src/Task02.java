import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int[] length = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int lengthN = length[0];
        int lengthM = length[1];

        Set<Integer> setN = new LinkedHashSet<>();
        Set<Integer> setM = new LinkedHashSet<>();
        Set<Integer> repeating = new LinkedHashSet<>();

        readSet(lengthN, setN, scanner);
        readSet(lengthM, setM, scanner);

        for (Integer elementN : setN) {
            if(setM.contains(elementN)){
                repeating.add(elementN);
            }
        }

        for (Integer e : repeating) {
            System.out.print(e + " ");
        }
    }
   private static void readSet(int length, Set<Integer> set, Scanner scanner){
       for (int i = 0; i < length; i++) {
           set.add(Integer.parseInt(scanner.nextLine()));
       }
   }
}
