import javax.swing.*;
/**
 * MySwingApplication
 *
 * @author (Grace Jau)
 * @version (0204)
 */
public class MySwingApplication implements Runnable
{
    JFrame jFrame;
    CanvasComponent canvasComponent;
    
    public void run(){
        jFrame = new JFrame("Window");
        jFrame.setSize(400, 400);
        canvasComponent = new CanvasComponent(100, 100);
        jFrame.add(canvasComponent);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
    
    public static void main(){
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
}
