import java.util.ArrayList;
/**
 * Sorting Algorithms
 *
 * @author (Grace Jau)
 * @version (0114)
 */
public class SortingAlgorithms
{
    private ArrayList <Integer> nums;
    private ArrayList <Integer> unsortedNums;

    /**
     * Constructor for objects of class SortingAlgorithms
     */
    public SortingAlgorithms()
    {
        nums = new ArrayList <Integer>();
        unsortedNums = new ArrayList <Integer>();
    }

    /**
     * stores the unsorted nums so that it can be referred to later
     */
    public void storeNums(){
        for (int i = 0; i < nums.size(); i++){
            unsortedNums.add(nums.get(i));
        }
    }
    
    /**
     * unsorts nums so that it is exactly the same as it was before it was sorted; this allows the sorting methods to be comparable because they unsort the exact same array of numbers
     */
    public void unsortNums(){
        for (int i = 0; i < nums.size(); i++){
            nums.set(i, unsortedNums.get(i));
        }
    }
    
    /**
     * implements the bubble sort algorithm
     */
    public void bubbleSort(){
        double initialTime = System.nanoTime();
        int compareCount = 0;
        int swapCount = 0;
        for (int i = 0; i < nums.size(); i++){//traverses array
             for (int j = 0; j < nums.size()-1; j++){
                 compareCount++;
                 if (nums.get(j) > nums.get(j+1)){//compares value to see if the right value is greater
                     swapCount++;
                     int swapper = nums.get(j);//swaps two values
                     nums.set(j, nums.get(j+1));
                     nums.set(j+1, swapper);
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
        for (int i = 0; i < nums.size()-1; i++){//traverses array
            int index = i;
            for (int j = i + 1; j < nums.size(); j++){
                compareCount++;
                if (nums.get(j) < nums.get(index)){//searches for the smallest value in the unsorted section
                    index = j;
                }
            }
            swapCount++;
            int smallerNumber = nums.get(index);//places that value at the end of the sorted section by swapping
            nums.set(index, nums.get(i));
            nums.set(i, smallerNumber);
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
        for (int i = 0; i < nums.size(); i++){
            for (int j = i; j > 0; j--){
                compareCount++;
                if (nums.get(j-1) > nums.get(j)){
                    swapCount++;
                    int smallerNumber = nums.get(j);
                    nums.set(j, nums.get(j-1));
                    nums.set(j-1, smallerNumber);
                }
            }
        }
        System.out.println("\nINSERTION SORT\nTime: "+(System.nanoTime()-initialTime)+" nanoseconds");
        System.out.println("Number of compares: "+ compareCount);
        System.out.print("Number of swaps: "+swapCount);
    }
    
    /**
     * Fills nums with integer values within the range provided (inclusive) until the array has the designated length
     */
    public void fillNums(int min, int max, int arrayLength){
        for (int i = 0; i < arrayLength; i++){
            nums.add((int)(Math.random()*((max+1)-min)+min));
        }
    }
    
    /**
     * Prints the values of nums in rows of ten
     */
    public void printNums(){
        for (int i = 0; i < nums.size(); i++){
            if(i%10 == 0){
                System.out.println();
            }
            System.out.print(nums.get(i)+", ");
        }
        System.out.println("\n++++++++++++++++++++++++++++++++++");
    }
}
