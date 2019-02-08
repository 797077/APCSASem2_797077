import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * MySwingApplication
 *
 * @author (Grace Jau)
 * @version (0204)
 */
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener, ActionListener, KeyListener
{
    public int width;
    public int height;
    int mouseFromX;
    int mouseFromY;
    int rectX = 0;
    int rectY = 0;
    boolean shapeSelected;
    int animationDeltaX = 1;
    int animationDeltaY = 0;
    int gutterX = 10;
    int gutterY = 10;
    Timer animationTimer;
    int motionSpeed = 1;

    /**
     * Constructor for objects of class CanvasComponent
     */
    public CanvasComponent(int w, int h)
    {
        setSize(w, h);
        width = w;
        height = h;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        animationTimer = new Timer(20, this);
        animationTimer.start();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void keyTyped(KeyEvent e)
    {
        char keyChar = e.getKeyChar();
        if (keyChar == '+'){
            motionSpeed++;
        }
        if (keyChar == '-'&& motionSpeed > 0){
            motionSpeed--;
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void keyPressed(KeyEvent e)
    {}
    
    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void keyReleased(KeyEvent e)
    {}
    
    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void actionPerformed(ActionEvent e)
    {
        Dimension componentSizeDimension = getSize();
        if (rectX+gutterX+width > getWidth()){
            rectX = getWidth()-width-gutterX;
            animationDeltaX = 0;
            animationDeltaY = 1;
            rectY += animationDeltaY*motionSpeed;
        }
        else if (rectY+gutterY+height > getHeight()){
            rectY = getHeight()-height-gutterY;
            animationDeltaX = -1;
            animationDeltaY = 0;
            rectX += animationDeltaY*motionSpeed;
        }
        else if (rectX < gutterX){
            rectX = gutterX;
            animationDeltaX = 0;
            animationDeltaY = -1;
            rectY += animationDeltaY*motionSpeed;
        }
        else if (rectY < gutterY){
            rectY = gutterY;
            animationDeltaX = 1;
            animationDeltaY = 0;
            rectX += animationDeltaY*motionSpeed;
        }
        else{
            rectX += animationDeltaX*motionSpeed;
            rectY += animationDeltaY*motionSpeed;
        }
        repaint();
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.black);
        g.fillRect(rectX, rectY, width, height);
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
        if (mouseFromX >= rectX && mouseFromX <= rectX+width && mouseFromY >= rectY && mouseFromY <= rectY+height){
            shapeSelected = true;
        }
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
        if (shapeSelected){
            int mouseToX = e.getX();
            int mouseToY = e.getY();
            rectX = mouseToX-mouseFromX;
            rectY = mouseToY-mouseFromY;
            repaint();
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void mouseMoved(MouseEvent e)
    {
        
    }
}
