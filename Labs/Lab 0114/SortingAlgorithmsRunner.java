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
        s.storeNums();
        s.printNums();
        s.bubbleSort();
        s.printNums();
        s.unsortNums();
        s.selectSort();
        s.printNums();
        s.unsortNums();
        s.insertionSort();
        s.printNums();
    }
}
