import javax.swing.*;
/**
 * MySwingApplication
 *
 * @author (Grace Jau)
 * @version (0204)
 */
public class MySwingApplication implements Runnable//implements the Runnable class
{
    JFrame jFrame;
    CanvasComponent canvasComponent;
    
    public void run(){//builds the window
        jFrame = new JFrame("Window");
        jFrame.setSize(400, 400);
        canvasComponent = new CanvasComponent(100, 100);//creates a canvasComponente
        jFrame.add(canvasComponent);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.addKeyListener(canvasComponent);//implements KeyListener
    }
    
    public static void main(){//declares and initializes the mySwingApplication
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
}
