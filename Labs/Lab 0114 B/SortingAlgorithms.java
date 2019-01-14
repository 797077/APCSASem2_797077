import java.util.ArrayList;
/**
 * Sorting Algorithms
 *
 * @author (Grace Jau)
 * @version (0114)
 */
public class SortingAlgorithms
{
    private ArrayList<Integer> nums;

    /**
     * Constructor for objects of class SortingAlgorithms
     */
    public SortingAlgorithms()
    {
        nums = new ArrayList<Integer>();
    }

    /**
     * implements the bubble sort algorithm
     */
    public void bubbleSort(){
        for (int i = 0; i < nums.size(); i++){//traverses array
             for (int j = 0; j < nums.size()-1; j++){
                 if (nums.get(j) > nums.get(j+1)){//compares value to see if the right value is greater
                     int swapper = nums.get(j);//swaps two values
                     nums.set(j,j+1);
                     nums.set(j+1,swapper);
                 }
             }
        }
    }
    
    /**
     * implements the select sort algorithm
     */
    public void selectSort(){
         for (int i = 0; i < nums.size()-1; i++){//traverses array
            int index = i;
            for (int j = i + 1; j < nums.size(); j++){
                if (nums.get(j) < nums.get(index)){//searches for the smallest value in the unsorted section
                    index = j;
                }
            }
            int smallerNumber = nums.get(index);//places that value at the end of the sorted section by swapping
            nums.set(index,nums.get(i));
            nums.set(i,smallerNumber);
         }
        }
    
    /**
     * Fills nums with integer values within the range provided (inclusive) until the array has the designated length
     */
    public void fillNums(int min, int max, int length){
        for (int i = 0; i < length; i++){
            nums.add(((int)(Math.random()*((max+1)-min)+min)));
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