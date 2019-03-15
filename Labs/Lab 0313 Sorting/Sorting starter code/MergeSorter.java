
/**
 * Sorting Lab
 * 
 * @author (Grace Jau) 
 * @version (0315)
 */
public class MergeSorter extends Sorter
{

    /**
     * Constructor for objects of class MergeSort
     */
    public MergeSorter()
    {
        super();
    }

    /**
     * method for merge sort
     *
     */
    public void sort(int[] a)
    {
        mergeSort(a, a.length);
    }
    
    /**
     * implements the merge sort algorithm
     */
    public static void mergeSort(int[] a, int n){
        if (n < 2){return;}//base case
        int mid = n/2;
        int[] l = new int[mid];//left half of array
        int[] r = new int[n-mid];//right half of array
        for (int i = 0; i < mid; i++){//copies the left half of a to l
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++){//copies the right half of a to r
            r[i-mid] = a[i];
        }
        mergeSort(l, mid);//continues to split arrays
        mergeSort(r, n-mid);
        merge(a, l, r, mid, n-mid);//merges the arrays back together and sorts them
    }
    
    /**
     * implements the merge sort algorithm
     */
    public static void merge(int[] a, int[] l, int[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while (i < left && j < right){
            if (l[i] <= r[j]){//compares the elements of each half of the array to sort and merge them
                a[k++] = l[i++];
            }else{
                a[k++] = r[j++];
            }
        }
        while (i < left) {a[k++] = l[i++];}
        while (j < right) {a[k++] = r[j++];}
    }
}
