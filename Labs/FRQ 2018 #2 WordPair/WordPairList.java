import java.util.ArrayList;
/**
 * FRQ 2018 #2 WordPair
 *
 * @author (Grace Jau)
 * @version (0311)
 */
public class WordPairList
{
    private ArrayList<WordPair> allPairs;

    /**
     * Constructor for objects of class WordPair
     */
    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<WordPair>();
    }

    /**
     */
    public int numMatches()
    {
        int sum = 0;
        for (int i = 0; i < allPairs.size(); i++){
            if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())){
                sum++;
            }
        }
        return sum;
    }
}
