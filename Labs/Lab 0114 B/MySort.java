import java.util.ArrayList;
/**
 * Sorts an ArrayList of integers in order from least to greatest
 *
 * @author (Grace Jau)
 * @version (0114)
 */
public class MySort
{
    private ArrayList<Integer> nums;//declares lists
    private ArrayList<Integer> numOfEachValue;
    private ArrayList<Integer> orderedNums;
    
    /**
     * Constructor for objects of class SortingAlgorithm
     */
    public MySort(){// initializes lists
        nums = new ArrayList<Integer>();
        numOfEachValue = new ArrayList<Integer>();
        orderedNums = new ArrayList<Integer>();
    }

    /**
     * creates a new ArrayList with the sorted values of num in order from least to greatest
     */
    public void sortNums(){
        double initialTime = System.nanoTime();
        int compareCount = 0;
        int swapCount = 0;
        int max = getMax(nums);
        int min = getMin(nums);
        for (int i = min; i <= max; i++){//counts the number of occurrences of each value
            int counter = 0;
            for (int j = 0; j < nums.size(); j++){
                compareCount++;
                if(nums.get(j) == i){
                    counter++;
                }
            }
            numOfEachValue.add(counter);
        }
        for (int i = 0; i < numOfEachValue.size(); i++){//adds the values in order to a new array
            for (int k = 0; k < numOfEachValue.get(i); k++){
                orderedNums.add(i+min);
            }
        }
        System.out.println("\nMY SORT\nTime: "+(System.nanoTime()-initialTime)+" nanosoconds");
        System.out.println("Number of compares: "+ compareCount);
        System.out.print("Number of swaps: "+swapCount);//this will always be zero because my sorting algorithm does not swap values
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
