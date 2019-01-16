import java.util.ArrayList;
/**
 * Sorts an ArrayList of integers in order from least to greatest
 *
 * @author (Grace Jau)
 * @version (0109)
 */
public class MySortingAlgorithmRunner
{
    public static void main(){// runs the methods
        MySort s = new MySort();
        s.fillNums(50, 1, 10);
        s.printNums();
        s.sortNums();
        s.printOrderedNums();
    }
}
