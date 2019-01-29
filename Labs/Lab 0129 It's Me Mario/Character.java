
/**
 * Lab 0129 It's Me Mario
 *
 * @author (Grace Jau)
 * @version (0129)
 */
public class Character
{
    private String catchphrase;
    private int speed;

    /**
     * Constructor for objects of class Character
     */
    public Character(String cp, int s)
    {
        catchphrase = cp;
        speed = s;
    }

    /**
     * set catchphrase to the parameter cp
     */
    public void setCatchphrase(String cp)
    {
        
    }
    
    /**
     * returns catchphrase
     */
    public String getCatchphrase()
    {
        return catchphrase;
    }
    
    /**
     * set speed to parameter s
     */
    public void setSpeed(int s)
    {
        speed = s;
    }
    
    /**
     * returns speed
     */
    public int getSpeed()
    {
        return speed;
    }
}
