import java.util.ArrayList;
/**
 * Sorts an ArrayList of integers in order from least to greatest
 *
 * @author (Grace Jau)
 * @version (0109)
 */
public class SortingAlgorithm
{
    private ArrayList<Integer> nums;
    private ArrayList<Integer> numOfEachValue;
    private ArrayList<Integer> orderedNums;
    
    /**
     * Constructor for objects of class SortingAlgorithm
     */
    public SortingAlgorithm(){
        nums = new ArrayList<Integer>();
        numOfEachValue = new ArrayList<Integer>();
        orderedNums = new ArrayList<Integer>();
    }

    /**
     * 
     */
    public void sortNums(){
        int max = getMax(nums);
        int min = getMin(nums);
        for (int i = min; i <= max; i++){
            int counter = 0;
            for (int j = 0; j < nums.size(); j++){
                if(nums.get(j) == i){
                    counter++;
                }
            }
            numOfEachValue.add(counter);
        }
        for (int i = 0; i < numOfEachValue.size(); i++){
            for (int k = 0; k < numOfEachValue.get(i); k++){
                orderedNums.add(i+min);
            }
        }
    }
    
    /**
     * returns the maximum integer value of an ArrayList array
     * assumes array has length of at least one
     */
    public int getMax(ArrayList<Integer> array){
        int max = array.get(0);
        for (int i = 1; i < array.size(); i++){
            if(array.get(i) > max){
                max = array.get(i);
            }
        }
        return max;
    }
    
    /**
     * returns the minimum integer value of an array
     * assumes array has length of at least one
     */
    public int getMin(ArrayList<Integer> array){
        int min = array.get(0);
        for (int i = 1; i < array.size(); i++){
            if(array.get(i) < min){
                min = array.get(i);
            }
        }
        return min;
    }
    
    /**
     * Fills nums with integer values within the range provided (inclusive) until the array has the designated length
     */
    public void fillNums(int length, int min, int max){
        for (int i = 0; i < length; i++){
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
    
    /**
     * Prints the values of orderedNums in rows of ten
     */
    public void printOrderedNums(){
        for (int i = 0; i < orderedNums.size(); i++){
            if(i%10 == 0){
                System.out.println();
            }
            System.out.print(orderedNums.get(i)+", ");
        }
        System.out.println("\n++++++++++++++++++++++++++++++++++");
    }
}
