/**
 * Sorting Algorithms
 *
 * @author (Grace Jau)
 * @version (0110)
 */
public class SortingAlgorithms
{
    private int[] nums;

    /**
     * Constructor for objects of class SortingAlgorithms
     */
    public SortingAlgorithms()
    {
        nums = new int[6];
    }

    /**
     * implements the bubble sort algorithm
     */
    public void bubbleSort(){
        for (int i = 0; i < nums.length; i++){//traverses array
             for (int j = 0; j < nums.length-i-1; j++){
                 if (nums[j] > nums[j+1]){//compares value to see if the right value is greater
                     int swapper = nums[j];//swaps two values
                     nums[j] = nums[j+1];
                     nums[j+1] = swapper;
                 }
             }
        }
    }
    
    /**
     * implements the select sort algorithm
     */
    public void selectSort(){
         for (int i = 0; i < nums.length-1; i++){//traverses array
            int index = i;
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] < nums[index]){//searches for the smallest value in the unsorted section
                    index = j;
                }
            }
            printNums();
            int smallerNumber = nums[index];//places that value at the end of the sorted section by swapping
            nums[index] = nums[i];
            nums[i] = smallerNumber;
            
         }
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
        System.out.println();
        //System.out.println("\n++++++++++++++++++++++++++++++++++");
    }
}