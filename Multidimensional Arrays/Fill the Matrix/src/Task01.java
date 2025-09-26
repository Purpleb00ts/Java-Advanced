import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] input = scanner.nextLine().split(", ");
        
        int matrixSize = Integer.parseInt(input[0]);
        
        char pattern = input[1].charAt(0);

        if(pattern == 'A'){
           readMatrix(patternA(matrixSize, pattern));
        }
        if(pattern == 'B'){
            readMatrix(patternB(matrixSize, pattern));
        }
        
        
    }
    
    private static int[][] patternA (int size, char pattern){
        int[][] matrix = new int[size][size];

        int filler = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[j][i] = filler;
                filler++;
            }
        }
        
        
        return matrix;
    }

    private static int[][] patternB (int size, char pattern){
        int[][] matrix = new int[size][size];

        int filler = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i % 2 == 0) {
                    if(i != 0 && j == 0){
                        filler += size + 1;
                    }
                    matrix[j][i] = filler;
                    filler++;
                }
                else{
                    if(j == 0) {
                        filler += size - 1;
                    }
                    matrix[j][i] = filler;
                    filler--;
                }
            }
        }


        return matrix;
    }

    private static void readMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
