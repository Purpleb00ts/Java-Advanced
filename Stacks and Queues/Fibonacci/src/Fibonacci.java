import java.util.Scanner;

public class Fibonacci {

    private static long[] memory;
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());

        memory = new long[n + 1];

        long fibonacci = fibonacciA(n);

        System.out.println(fibonacci);
    }

    private static long fibonacciA(int n){
       if(n < 2){
           return 1;
       }
       if(memory[n] != 0){
           return memory[n];
       }
       memory[n] = fibonacciA(n - 1) + fibonacciA(n - 2);
        return memory[n];
    }
}
 