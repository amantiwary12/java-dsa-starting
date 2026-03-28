import java.util.Scanner;

public class Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input row and column sizes
        int row = sc.nextInt();
        int col = sc.nextInt();

        // Declare 2D array
        int[][] number = new int[row][col];

        // Input elements into the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        // Output elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        sc.close(); // Optional but good practice
    }
}
