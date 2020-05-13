package domain;
import java.util.Arrays;
/**
 * This class fill the matrix by numbers from x to end of matrix
 */
public class Exercise {
    /**
     * A method that fills a matrix with numbers from x to the end of the matrix
     * @param matrix
     * @param x 
     */
    public void fillmatr( int[][] matrix, int x){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = x;
                x++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }
}
