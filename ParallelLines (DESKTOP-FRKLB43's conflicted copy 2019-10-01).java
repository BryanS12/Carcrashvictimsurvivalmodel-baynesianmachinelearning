import java.awt.*;
import javax.swing.*;


/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 *          Period - TODO Your Period Assignment - A12.6 - ParallelLines
 * 
 *          Sources - TODO list collaborators
 */
public class ParallelLines extends JPanel
{
    // TODO Your Instance Variables Here

    public void paintComponent( Graphics g )
    {
        super.paintComponent( g ); // Call JPanel's paintComponent method
                                   // to paint the background

        int width = getWidth();
        int height = getHeight();

        drawIllusion( g, width, height );
    }


    /**
     * prints the parallel lines
     * 
     * @param g 
     * @param width
     * @param height
     * @param size
     */
    public void drawIllusion( Graphics g, int width, int height )
    {

        for ( int row = 0; row < 8; row++ )
        {
            // calculate the start of the row of squares
            // calculate and add a horizontal offset

            for ( int col = 0; col < 8; col++ )
            {

                // draw the square
                int y = width / 7;
                int w = width / 14;
                int z = width / 49;
                int h = height / 8;
                if ( row % 4 != 3 )
                {
                    g.fillRect( col * y + ( row % 4 ) * z, row * h, w, h );
                }
                else
                {
                    g.fillRect( y * col + z, row * h, w, h );
                }

                // calculate and position for the next square

            }
            ;
            // calculate the location and draw the line

            g.drawLine( 0, height * ( row ) / 8, width, height * ( row ) / 8 );

        }

    }


    public static void main( String[] args )
    {
        JFrame w = new JFrame( "ParallelLines" );
        w.setBounds( 100, 100, 640, 480 );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        ParallelLines panel = new ParallelLines();
        panel.setBackground( Color.WHITE );
        Container c = w.getContentPane();
        c.add( panel );
        w.setResizable( true );
        w.setVisible( true );
    }
}
