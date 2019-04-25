import java.util.ArrayList;
/**
 * Lab 0425 Problem One
 *
 * @author (Grace Jau)
 * @version (0425)
 */
public class ProblemOne
{
    private ArrayList<Integer> arr1;
    /**
     * Constructor for objects of class ProblemOne
     */
    public ProblemOne()
    {
        arr1 = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++){
            arr1.add(i);
        }
        arr1.set((int)(Math.random()*100+1), 0);
    }

    /**
     * Finds the missing value that has been replaced with zero
     */
    public Integer findMissing(ArrayList<Integer> arr1)
    {
        int sum = 0;
        for (int i = 0; i < arr1.size(); i++){
            sum += arr1.get(i);
        }
        return 5050-sum;
    }
}
