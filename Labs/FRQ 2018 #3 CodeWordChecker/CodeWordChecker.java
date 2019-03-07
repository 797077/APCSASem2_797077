
/**
 * FRQ 2018 #3 CodeWordChecker
 *
 * @author (Grace Jau)
 * @version (0307)
 */
public class CodeWordChecker //implements StringChecker
{
    int min;
    int max;
    String word;

    /**
     * Constructor for objects of class CodeWordChecker
     */
    public CodeWordChecker(int a, int b, String w)
    {
        min = a;
        max = b;
        word = w;
    }
    
    /**
     * Constructor for objects of class CodeWordChecker
     */
    public CodeWordChecker(String w)
    {
        min = 6;
        max = 20;
        word = w;
    }

    /**
     * checks if the parameter String is valid by certain criteria
     */
    public boolean sampleMethod(String codeWord)
    {
        if (codeWord.length() > max || codeWord.length() < min){
            return false;
        }
        for (int i = 0; i <= codeWord.length()-word.length();){
            if (codeWord.substring(i, i+word.length()).equals(word)){
                return false;
            }
        }
        return true;
    }
}
