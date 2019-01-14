/**
 * Sorting Algorithms
 *
 * @author (Grace Jau)
 * @version (0114)
 */
public class SortingAlgorithmsRunner
{
    public static void main(){
        SortingAlgorithms s = new SortingAlgorithms();
        s.fillNums(0, 9, 20);
        s.printNums();
        s.bubbleSort();
        s.printNums();
        SortingAlgorithms t = new SortingAlgorithms();
        t.fillNums(0, 9, 20);
        t.printNums();
        t.selectSort();
        t.printNums();
    }
}
