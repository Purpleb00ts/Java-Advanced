import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotate = scanner.nextLine();

        String input = scanner.nextLine();

        int degrees = 0;

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(rotate);
        while(m.find()) {
            degrees = Integer.parseInt(m.group());
        }

        int countOfWords = 0;

        int longestString = input.length();

        String[][] matrix = new String[1000][1000];

        while(!input.equals("END")){
            if(input.length() > longestString){
                longestString = input.length();
            }
            String[] arrInput = input.split("");
            matrix[countOfWords] = arrInput;
            countOfWords++;
            input = scanner.nextLine();
        }

        int rows = countOfWords;
        int cols = longestString;

        String[][] matrixToRotate = new String[countOfWords][longestString];

        for (int i = 0; i < countOfWords; i++) {
            for (int j = 0; j < longestString; j++) {
                if(j < matrix[i].length) {
                    matrixToRotate[i][j] = matrix[i][j];
                }
                else{
                    matrixToRotate[i][j] = " ";
                }
            }
        }

        int rotations = degrees / 90;

        if(rotations % 4 == 1){
            for (int k = 0; k < cols; k++) {
                for (int j = rows - 1; j >= 0; j--) {
                    System.out.printf(matrixToRotate[j][k]);
                }
                System.out.println();
            }
        }
        else if(rotations % 4 == 3){
            for (int k = cols - 1; k >= 0; k--) {
                for (int j = 0; j < rows; j++) {
                    System.out.printf(matrixToRotate[j][k]);
                }
                System.out.println();
            }
        }
        if(rotations % 4 == 2){
            for (int j = rows - 1; j >= 0; j--) {
                for (int k = cols - 1; k >= 0; k--) {
                    System.out.printf(matrixToRotate[j][k]);
                }
                System.out.println();
            }
        }
        else if(rotations % 4 == 0){
            for (int k = 0; k < rows; k++) {
                for (int j = 0; j < cols; j++) {
                    System.out.printf(matrixToRotate[k][j]);
                }
                System.out.println();
            }
        }
    }
}
