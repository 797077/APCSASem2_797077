
/**
 * Lab 0129 It's Me Mario
 *
 * @author (Grace Jau)
 * @version (0129)
 */
public class Mario extends Character
{
    String catchphrase;
    int speed;
    
    /**
     * Constructor for objects of class Mario
     */
    public Mario(String cp, int s)
    {
        super(cp, s);
        catchphrase = cp;
        speed = s;
    }

    /**
     * overrides the parent class and doubles Mario's speed
     */
    public void setSpeed(int s)
    {
        super.setSpeed(s*2);
    }
}
