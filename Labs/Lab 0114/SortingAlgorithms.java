/**
 * Sorting Algorithms
 *
 * @author (Grace Jau)
 * @version (0110)
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
    }

    public void storeNums(){
        unsortedNums = nums;
    }
    
    public void unsortNums(){
        nums = unsortedNums;
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
        System.out.println("\nBUBBLE SORT\nTime: "+(System.nanoTime()-initialTime));
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
        System.out.println("\nSELECT SORT\nTime: "+(System.nanoTime()-initialTime));
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
        System.out.println("\nINSERTION SORT\nTime: "+(System.nanoTime()-initialTime));
        System.out.println("Number of compares: "+ compareCount);
        System.out.print("Number of swaps: "+swapCount);
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
}