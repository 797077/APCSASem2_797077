
/**
 * Lab 0425 Problem One
 *
 * @author (Grace Jau)
 * @version (0425)
 */
public class ProblemFive
{
    

    /**
     * Constructor for objects of class ProblemFive
     */
    public ProblemFive()
    {
        
    }

    /**
     * flips a 2D array across a diagonal leading from the upper left corner to the lower right
     */
    public int[][] flipDiagonal(int[][] matrix)
    {
        for (int r = 0; r < matrix.length/2; r++){
            for (int c = 0; c < matrix[0].length/2; c++){
                int temp = matrix[r][c];
                matrix[r][c] = matrix[matrix.length-c-1][matrix.length-r-1];
                matrix[matrix.length-c-1][matrix.length-r-1] = temp;
            }
        }
        return matrix;
    }
}
