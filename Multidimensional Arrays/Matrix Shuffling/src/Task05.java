import java.util.Arrays;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixSize = readArr(scanner);

        int rows = matrixSize[0];
        int cols = matrixSize[1];

        String[][] matrix = readMatrix(cols, rows, scanner);

        String input = scanner.nextLine();

        while(!input.equals("END")){
            String[] commands = input.split(" ");

            if(commands[0].equals("swap") && commands.length == 5){
                int indexOfRowToSwap = Integer.parseInt(commands[1]);
                int indexOfColToSwap = Integer.parseInt(commands[2]);
                int indexOfRow = Integer.parseInt(commands[3]);
                int indexOfCol = Integer.parseInt(commands[4]);
                if(indexOfRowToSwap <= rows - 1 && indexOfColToSwap <= cols - 1 && indexOfRow <= rows - 1 && indexOfCol <= cols - 1) {
                    String temp = matrix[indexOfRowToSwap][indexOfColToSwap];
                    matrix[indexOfRowToSwap][indexOfColToSwap] = matrix[indexOfRow][indexOfCol];
                    matrix[indexOfRow][indexOfCol] = temp;
                    outputMatrix(matrix, rows, cols);
                }
                else {
                    System.out.println("Invalid input!");
                }
            }
            else{
                System.out.println("Invalid input!");
            }


            input = scanner.nextLine();
        }


    }

    private static int[] readArr(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static String[][] readMatrix(int cols, int rows, Scanner scanner){
        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] inputArr = scanner.nextLine().split(" ");

            matrix[i] = inputArr;
        }
        return matrix;
    }

    private static void outputMatrix(String[][] shuffledMatrix, int rows, int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%s ", shuffledMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
