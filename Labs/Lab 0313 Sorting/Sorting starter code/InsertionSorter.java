
/**
 * Sorting Lab
 * 
 * @author (Grace Jau) 
 * @version (0315)
 */
public class InsertionSorter extends Sorter
{
    
    /**
     * Constructor for objects of class InsertionSorter
     */
    public InsertionSorter()
    {
        super();
    }

    /**
     * method for insertion sort
     * 
     */
    public void sort(int[] a)
    {
        for (int i = 0; i < a.length; i++){
            for (int j = i; j > 0; j--){
                if (less(a[j-1], a[j])){
                    swap(a, j, j-1);
                }
            }
        }
    }
}
