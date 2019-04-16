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
        stringList = new ArrayList<String>();
    }

    /**
     * a) sorts strings in alphabetical order using selection sort
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
     * b) shuffles the strings in the ArrayList parameter
     */
    public void shuffleStrings(ArrayList<String> names)
    {
       for (int k = names.size() - 1; k > 0; k--) {
            int howMany = k + 1;
            int start = 0;
            int randPos = (int) (Math.random() * howMany) + start;
            String temp = names.get(k);
            names.set(k, names.get(randPos));
            names.set(randPos, temp);
       }
    }
    
    /**
     * c) inserts the String parameter at the correct place in the ArrayList
     */
    public void insertString(String word)
    {
       for (int i = 0; i < stringList.size()-1; i++){//traverses array
            if (word.compareTo(stringList.get(i))<=0){
                stringList.add(i, word);
                return;
            }
       }
       stringList.add(word);
    }
}
