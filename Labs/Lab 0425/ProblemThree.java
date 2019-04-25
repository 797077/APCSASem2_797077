
/**
 * Lab 0425 Problem One
 *
 * @author (Grace Jau)
 * @version (0425)
 */
public class ProblemThree
{
    private String letters;

    /**
     * Constructor for objects of class ProblemThree
     */
    public ProblemThree(String l)
    {
        letters = l;
    }

    /**
     * finds the first repeating character in a given string
     */
    public String findFirstRepeating(String letters)
    {
        for (int i = 0; i < letters.length()-1; i++){
            if (letters.indexOf(letters.substring(i, i+1), i+1) != -1){
                return letters.substring(i, i+1);
            }
        }
        return "";
    }
}
