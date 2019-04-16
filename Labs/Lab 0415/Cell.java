import java.util.List;
import java.util.ArrayList;
/**
 * Lab 0415 Classwork Question 5b
 *
 * @author (Grace Jau)
 * @version (0415)
 */
public class Cell
{
    private boolean occupied;
    private int id;
    private List<Cell> neighbors;

    /**
     * Constructor for objects of class Cell
     */
    public Cell()
    {
        neighbors = new ArrayList<Cell>();
    }

    /**
     * sets occupied to the parameter
     */
    public void setOccupied(boolean o)
    {
        occupied = o;
    }
    
    /**
     * returns occupied
     */
    public boolean getOccupied()
    {
        return occupied;
    }
    
    /**
     * returns neighbors
     */
    public List<Cell> getNeighbors()
    {
        return neighbors;
    }
}
