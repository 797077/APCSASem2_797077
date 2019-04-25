
/**
 * Lab 0425 Problem One
 *
 * @author (Grace Jau)
 * @version (0425)
 */
public class ProblemTwo
{
    

    /**
     * Constructor for objects of class ProblemTwo
     */
    public ProblemTwo()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    public int findSum(int[] a1, int[] a2, int targ)
    {
        int sum = a1[0] + a2[0];
        int difference = Math.abs(targ-sum);
        for (int i = 0; i < a1.length; i++){
            for (int j = 0; j < a2.length; j++){
                if(Math.abs(targ-(a1[i] + a2[j])) < difference){
                    sum = a1[i] + a2[j];
                    difference = Math.abs(targ-sum);
                }
            }
        }
        return sum;
    }
}
