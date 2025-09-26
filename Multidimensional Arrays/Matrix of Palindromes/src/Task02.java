import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        
        int rows = inputArr[0];
        int cols = inputArr[1];

        readMatrix(matrixOfPalindromes(rows, cols), rows, cols);
    }
    
    private static String[][] matrixOfPalindromes(int rows, int cols){
        String[][] matrix = new String[rows][cols];

        int letter = 'a';

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = String.valueOf((char)(letter + i)) + String.valueOf((char)(letter + j + i)) + String.valueOf((char)(letter + i));
            }
        }
        
        return matrix;
    }

    private static void readMatrix(String[][] matrix,int rows,int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%s ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
