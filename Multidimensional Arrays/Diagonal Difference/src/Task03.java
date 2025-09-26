import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());

        int[][] matrix = inputMatrix(matrixSize, scanner);

        int sumFirstDiagonal = 0;

        for (int i = 0; i < matrixSize; i++) {
            sumFirstDiagonal += matrix[i][i];
        }

        int sumSecondDiagonal = 0;

        int iter = matrix.length - 1;

        for (int i = 0; i < matrixSize; i++) {
            sumSecondDiagonal += matrix[i][iter];
            iter--;
        }

        System.out.println(Math.abs(sumFirstDiagonal - sumSecondDiagonal));
    }
    private static int[][] inputMatrix(int size, Scanner scanner){

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            matrix[i] = arr;
        }

        return matrix;
    }
}
