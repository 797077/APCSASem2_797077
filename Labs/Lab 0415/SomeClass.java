import java.util.ArrayList;
/**
 * Lab 0415 Classwork Question 4
 *
 * @author (Grace Jau)
 * @version (0415)
 */
public class SomeClass
{
    private ArrayList<String> stringList;

    /**
     * Constructor for objects of class SomeClass
     */
    public SomeClass()
    {
        
    }

    /**
     * sorts strings in alphabetical order using selection sort
     */
    public void sortStrings(ArrayList<String> names)
    {
       for (int i = 0; i < names.size()-1; i++){//traverses array
            int index = i;
            for (int j = i + 1; j < names.size(); j++){
                if (names.get(j).compareTo(names.get(index))<=0){//searches for the smallest value in the unsorted section
                    index = j;
                }
            }
            String smallerNumber = names.get(index);//places that value at the end of the sorted section by swapping
            names.set(index, names.get(i));
            names.set(i, smallerNumber);
         }
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    public void shuffleStrings(ArrayList<String> names)
    {
       for (int i = 0; i < names.size(); i++){
           
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    public void insertString(ArrayList<String> word)
    {
       
    }
}
