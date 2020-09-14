package matrixVariant4;

import java.util.Scanner;

/**
 * You are given positive integers M, N and a set of N numbers.
 * Form a matrix of size M ґ N, in which each row contains all numbers
 * from the original set (in the same order).
 */
public class MatrixVariant4 {
    public static void main(String[] args){
        // entering size of matrix
        System.out.println("enter n");
        int n = getPositiveInteger();

        System.out.println("enter m");
        int m = getPositiveInteger();

        // filling matrix
        int[][] matrix = getFilledMatrix(m,n);

        showMatrix(matrix);
    }

    /**
     *
     * @return positive int number
     */
    public static int getPositiveInteger(){
        int number;

        while (true){
            number = getInteger();
            if(number > 0) return number;
        }
    }

    /**
     *
     * @return int number
     */
    public static int getInteger(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("enter number:  ");

            if(scanner.hasNextInt()){
                return scanner.nextInt();
            }
            else {
                scanner.next();
            }
        }
    }

    /**
     *
     * @param m matrix rows
     * @param n matrix columns
     * @return filled matrix
     */
    public static int[][] getFilledMatrix(int m, int n){
        int[][] matrix = new int[m][n];
        int temp;

        for(int i = 0;i < n; i++){
            System.out.println("enter [" + i + "] element");
            temp = getInteger();

            for(int j = 0;j < m; j++){
                matrix[j][i] = temp;
            }
        }

        return matrix;
    }

    /**
     * show matrix
     * @param matrix for showing
     */
    public static void showMatrix(int[][] matrix){
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
