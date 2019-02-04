import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * MySwingApplication
 *
 * @author (Grace Jau)
 * @version (0204)
 */
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener
{
    public int width;
    public int height;
    int mouseFromX;
    int mouseFromY;

    /**
     * Constructor for objects of class CanvasComponent
     */
    public CanvasComponent(int w, int h)
    {
        setSize(w, h);
        width = w;
        height = h;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.black);
        g.fillRect(0, 0, width, height);
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void mouseClicked(MouseEvent e)
    {
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void mousePressed(MouseEvent e)
    {
        mouseFromX = e.getX();
        mouseFromY = e.getY();
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void mouseReleased(MouseEvent e)
    {
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void mouseEntered(MouseEvent e)
    {
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void mouseExited(MouseEvent e)
    {
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void mouseDragged(MouseEvent e)
    {
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void mouseMoved(MouseEvent e)
    {
        
    }
}
