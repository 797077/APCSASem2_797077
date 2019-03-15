
/**
 * Sorting Lab
 * 
 * @author (Grace Jau) 
 * @version (0315)
 */
public class SelectionSorter extends Sorter
{
    
    /**
     * Constructor for objects of class SelectionSorter
     */
    public SelectionSorter()
    {
        super();
    }

    /**
     * method for selection sort
     *
     */
    public void sort(int[] a)
    {
        for (int i = 0; i < a.length-1; i++){//traverses array
            int index = i;
            for (int j = i + 1; j < a.length; j++){
                if (less(a[j], a[index])){//searches for the smallest value in the unsorted section
                    index = j;
                }
            }
            swap(a, i, index);//places that value at the end of the sorted section by swapping
         }
    }
}
