import java.awt.*;
import javax.swing.*;

/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.
  
   @author  TODO Your Name
   @version TODO Date

   Period - TODO Your Period
   Assignment - A12.6 - ParallelLines

   Sources - TODO list collaborators
 */
public class ParallelLines extends JPanel
{
  // TODO Your Instance Variables Here
    
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    
    int width = getWidth();    
    int height = getHeight();
    
    drawIllusion(g, width, height);
  }

  /**
     TODO Write your method description here.
     @param g
     @param width
     @param height
     @param size
   */
  public void drawIllusion(Graphics g, int width, int height)
  {
      int x = 50;
      int y = 50;
      for ( int row = 0; row < 8; row++ )
      {
        // calculate the start of the row of squares
        // calculate and add a horizontal offset
          g.drawLine(0,  row, width, row);  

        for ( int col = 0; col < 7; col++ )
        {
           
          // draw the square
           
            
            g.fillRect(0, 0, 50, 50);
            g.fillRect(x ,0, y, 50);
            //g.fillRect( x,  x +width - 1, y ,y + height - 1);
          // calculate and position for the next square
            
        }

        // calculate the location and draw the line
        g.drawLine(x,  width -1, y, width-1);
      }
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("ParallelLines");
    w.setBounds(100, 100, 640, 480);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ParallelLines panel = new ParallelLines();
    panel.setBackground(Color.WHITE);
    Container c = w.getContentPane();
    c.add(panel);
    w.setResizable(true);
    w.setVisible(true);
  }
}
