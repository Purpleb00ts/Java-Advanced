import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int[] matrixSize = readArr(scanner);

        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int[][] matrix = readMatrix(rows, cols, scanner);

        int maxSum = 0;

        int[][] maxMatrix = new int[3][3];



        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                int currentElem = matrix[i][j];
                int rightOfCurrent = matrix[i][j + 1];
                int secondRightOfCurrent = matrix[i][j + 2];
                int belowCurrent = matrix[i + 1][j];
                int belowBelowCurrent = matrix [i + 2][j];
                int belowRightOfCurrent = matrix[i + 1][j + 1];
                int belowSecondRight = matrix[i + 1][j + 2];
                int rightOfBelowBelowCurrent = matrix[i + 2][j + 1];
                int rightRightOfBelowBelowCurrent = matrix[i + 2][j + 2];
                int sum = currentElem + rightOfCurrent + secondRightOfCurrent + belowCurrent + belowBelowCurrent + belowRightOfCurrent + belowSecondRight + rightOfBelowBelowCurrent + rightRightOfBelowBelowCurrent;
                if(maxSum < sum){
                    maxSum = sum;
                    maxMatrix[0][0] = currentElem;
                    maxMatrix[0][1] = rightOfCurrent;
                    maxMatrix[0][2] = secondRightOfCurrent;
                    maxMatrix[1][0] = belowCurrent;
                    maxMatrix[1][1] = belowRightOfCurrent;
                    maxMatrix[1][2] = belowSecondRight;
                    maxMatrix[2][0] = belowBelowCurrent;
                    maxMatrix[2][1] = rightOfBelowBelowCurrent;
                    maxMatrix[2][2] = rightRightOfBelowBelowCurrent;
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        outputMatrix(maxMatrix);
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner){
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] inputArr = readArr(scanner);
            matrix[i] = inputArr;
        }
        return matrix;
    }

    private static int[] readArr(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static void outputMatrix(int[][] maxMatrix){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", maxMatrix[i][j]);
            }
            System.out.println();
        }
    }

}
