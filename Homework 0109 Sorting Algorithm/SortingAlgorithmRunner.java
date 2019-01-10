import java.util.ArrayList;
/**
 * Sorts an ArrayList of integers in order from least to greatest
 *
 * @author (Grace Jau)
 * @version (0109)
 */
public class SortingAlgorithmRunner
{
    public static void main(){
        SortingAlgorithm s = new SortingAlgorithm();
        s.fillNums(50, 1, 10);
        s.printNums();
        s.sortNums();
        s.printOrderedNums();
    }
}