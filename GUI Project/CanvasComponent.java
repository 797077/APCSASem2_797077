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
    public int width;//width of square
    public int height;//height of square
    int mouseFromX;//mouse x-coordinate
    int mouseFromY;//mouse y-coordinate
    int rectX = 0;//far right of square
    int rectY = 0;//bottom of square
    boolean shapeSelected;//if shape is selected
    int animationDeltaX = 1;//change in x-position of square
    int animationDeltaY = 0;//change in y-position of square
    int gutterX = 10;//a border in which square cannot go
    int gutterY = 10;//a border in which square cannot go
    Timer animationTimer;
    int motionSpeed = 1;//speed of square
    boolean mousePressed = false;//if mouse is pressed

    /**
     * Constructor for objects of class CanvasComponent
     */
    public CanvasComponent(int w, int h)
    {
        setSize(w, h);
        width = w;
        height = h;
        this.addMouseListener(this);//implements MouseListener
        this.addMouseMotionListener(this);
        animationTimer = new Timer(20, this);//implements Timer
        animationTimer.start();
    }

    /**
     * checks to see if certain keys are pressed and changes speed accordingly
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
     *
     * 
     */
    public void keyPressed(KeyEvent e)
    {}
    
    /**
     * 
     * 
     */
    public void keyReleased(KeyEvent e)
    {}
    
    /**
     * performs actions based on square's location, speed, and user activity
     * 
     */
    public void actionPerformed(ActionEvent e)
    {
        Dimension componentSizeDimension = getSize();
        if (rectX+gutterX+width > getWidth()){//for square moving right to moving down
            rectX = getWidth()-width-gutterX;//makes sure squared does not enter gutter
            animationDeltaX = 0;//square stops moving right
            animationDeltaY = 1;//square moves down
            rectY += animationDeltaY*motionSpeed;//moves square by the correct speed
        }
        else if (rectY+gutterY+height > getHeight()){//for square moving down to moving left
            rectY = getHeight()-height-gutterY;
            animationDeltaX = -1;
            animationDeltaY = 0;
            rectX += animationDeltaY*motionSpeed;
        }
        else if (rectX < gutterX){//for square moving left to moving up
            rectX = gutterX;
            animationDeltaX = 0;
            animationDeltaY = -1;
            rectY += animationDeltaY*motionSpeed;
        }
        else if (rectY < gutterY){//for square moving up to moving right
            rectY = gutterY;
            animationDeltaX = 1;
            animationDeltaY = 0;
            rectX += animationDeltaY*motionSpeed;
        }
        else{
            rectX += animationDeltaX*motionSpeed;
            rectY += animationDeltaY*motionSpeed;
        }
        
        if (mousePressed && mouseFromX != rectX && mouseFromY != rectY){
            animationDeltaX = (mouseFromX-(rectX+(width/2)));//moves x-position of square to mouse
            animationDeltaY = (mouseFromY-(rectY+(height/2)));//moves y-position of square to mouse
            rectX += animationDeltaX*motionSpeed;
            rectY += animationDeltaY*motionSpeed;
        }
        repaint();//repaints square
    }
    
    /**
     * paints square
     * 
     */
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.black);//makes the square black in color
        g.fillRect(rectX, rectY, width, height);//paints the square at the given points with the given width and height
    }
    
    /**
     * 
     * 
     */
    public void mouseClicked(MouseEvent e)
    {
        
    }
    
    /**
     * when the mouse is pressed, checks to see if the shape is selected by the mouse
     * 
     */
    public void mousePressed(MouseEvent e)
    {
        mouseFromX = e.getX();
        mouseFromY = e.getY();
        mousePressed = true;
        if (mouseFromX >= rectX && mouseFromX <= rectX+width && mouseFromY >= rectY && mouseFromY <= rectY+height){
            shapeSelected = true;
        }
    }
    
    /**
     * checks if mouse is released
     * 
     */
    public void mouseReleased(MouseEvent e)
    {
        mousePressed = false;
    }
    
    /**
     * 
     * 
     */
    public void mouseEntered(MouseEvent e)
    {    
    }
    
    /**
     * 
     * 
     */
    public void mouseExited(MouseEvent e)
    {  
    }
    
    /**
     * gets the position of the mouse as it is dragged, and if the shape is selected, adjusts the coordinates of the square accordingly
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
        }else{
            mouseFromX = e.getX();
            mouseFromY = e.getY();
        }
    }
    
    /**
     *
     * 
     */
    public void mouseMoved(MouseEvent e)
    {
        
    }
}
