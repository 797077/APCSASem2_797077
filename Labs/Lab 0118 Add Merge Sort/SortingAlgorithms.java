/**
 * Sorting Algorithms
 *
 * @author (Grace Jau)
 * @version (0118)
 */
public class SortingAlgorithms
{
    private int[] nums;
    private int[] unsortedNums;

    /**
     * Constructor for objects of class SortingAlgorithms
     */
    public SortingAlgorithms()
    {
        nums = new int[50];
        unsortedNums = new int[50];
    }

    /**
     * stores the unsorted nums so that it can be referred to later
     */
    public void storeNums(){
        for (int i = 0; i < nums.length; i++){
            unsortedNums[i] = nums[i];
        }
    }
    
    /**
     * unsorts nums so that it is exactly the same as it was before it was sorted; this allows the sorting methods to be comparable because they unsort the exact same array of numbers
     */
    public void unsortNums(){
        for (int i = 0; i < nums.length; i++){
            nums[i] = unsortedNums[i];
        }
    }
    
    /**
     * implements the bubble sort algorithm
     */
    public void bubbleSort(){
        double initialTime = System.nanoTime();
        int compareCount = 0;
        int swapCount = 0;
        for (int i = 0; i < nums.length; i++){//traverses array
             for (int j = 0; j < nums.length-i-1; j++){
                 compareCount++;
                 if (nums[j] > nums[j+1]){//compares value to see if the right value is greater
                     swapCount++;
                     int swapper = nums[j];//swaps two values
                     nums[j] = nums[j+1];
                     nums[j+1] = swapper;
                 }
             }
        }
        System.out.println("\nBUBBLE SORT\nTime: "+(System.nanoTime()-initialTime)+" nanoseconds");
        System.out.println("Number of compares: "+ compareCount);
        System.out.print("Number of swaps: "+swapCount);
    }
    
    /**
     * implements the select sort algorithm
     */
    public void selectSort(){
        double initialTime = System.nanoTime();
        int compareCount = 0;
        int swapCount = 0;
        for (int i = 0; i < nums.length-1; i++){//traverses array
            int index = i;
            for (int j = i + 1; j < nums.length; j++){
                compareCount++;
                if (nums[j] < nums[index]){//searches for the smallest value in the unsorted section
                    index = j;
                }
            }
            swapCount++;
            int smallerNumber = nums[index];//places that value at the end of the sorted section by swapping
            nums[index] = nums[i];
            nums[i] = smallerNumber;
         }
        System.out.println("\nSELECT SORT\nTime: "+(System.nanoTime()-initialTime)+" nanoseconds");
        System.out.println("Number of compares: "+ compareCount);
        System.out.print("Number of swaps: "+swapCount);
    }
    
    /**
     * implements the insertion sort algorithm
     */
    public void insertionSort(){
        double initialTime = System.nanoTime();
        int compareCount = 0;
        int swapCount = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j > 0; j--){
                compareCount++;
                if (nums[j-1] > nums[j]){
                    swapCount++;
                    int smallerNumber = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = smallerNumber;
                }
            }
        }
        System.out.println("\nINSERTION SORT\nTime: "+(System.nanoTime()-initialTime)+" nanoseconds");
        System.out.println("Number of compares: "+ compareCount);
        System.out.print("Number of swaps: "+swapCount);
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
    
    /**
     * Fills nums with integer values within the range provided (inclusive) until the array has the designated length
     */
    public void fillNums(int min, int max){
        for (int i = 0; i < nums.length; i++){
            nums[i] = ((int)(Math.random()*((max+1)-min)+min));
        }
    }
    
    /**
     * Prints the values of nums in rows of ten
     */
    public void printNums(){
        for (int i = 0; i < nums.length; i++){
            if(i%10 == 0){
                System.out.println();
            }
            System.out.print(nums[i]+", ");
        }
        System.out.println("\n++++++++++++++++++++++++++++++++++");
    }
    
    public static void main(){//runs mergeSort
        SortingAlgorithms s = new SortingAlgorithms();
        int[] a = new int[50];
        for (int i = 0; i < a.length; i++){//fills array a
            a[i] = ((int)(Math.random()*(10)+1));
        }
        for (int i = 0; i < a.length; i++){//prints the unsorted a
            if(i%10 == 0){
                System.out.println();
            }
            System.out.print(a[i]+", ");
        }
        System.out.println("\n++++++++++++++++++++++++++++++++++");
        s.mergeSort(a, a.length);//runs mergeSort
        for (int i = 0; i < a.length; i++){//prints sorted a
            if(i%10 == 0){
                System.out.println();
            }
            System.out.print(a[i]+", ");
        }
    }
}
