package test;
import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Exercise ex = new Exercise();
        ex.fillmatr(matrix,3);
        int [][] matr = new int[6][6];
        Exercise exercise = new Exercise();
        exercise.fillmatr(matr,20);
    }
}
