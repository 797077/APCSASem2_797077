/**
 * Sorting Algorithms
 *
 * @author (Grace Jau)
 * @version (0110)
 */
public class SortingAlgorithmsRunner
{
    public static void main(){
        SortingAlgorithms s = new SortingAlgorithms();
        s.fillNums(0, 9);
        //s.printNums();
        //s.bubbleSort();
        //s.printNums();
        //SortingAlgorithms t = new SortingAlgorithms();
        //t.fillNums(0, 9);
        //t.printNums();
        s.selectSort();
        //t.printNums();
    }
}
