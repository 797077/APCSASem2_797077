import java.util.ArrayList;
/**
 * Lab 0425 Problem One
 *
 * @author (Grace Jau)
 * @version (0425)
 */
public class ProblemFour
{
    

    /**
     * Constructor for objects of class ProblemFour
     */
    public ProblemFour()
    {
        
    }

    /**
     * returns an arrayList that contains the elements that are common to all three input arrays
     *
     */
    public ArrayList<Integer> findIntersection(int[] a1, int[] a2, int[] a3)
    {
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        for (int i = 0; i < a1.length; i++){
            if (java.util.Arrays.binarySearch(a2, 0, a2.length, a1[i]) >= 0 &&
                java.util.Arrays.binarySearch(a3, 0, a3.length, a1[i]) >= 0){
                intersection.add(a1[i]);
            }
        }
        return intersection;
    }
}
