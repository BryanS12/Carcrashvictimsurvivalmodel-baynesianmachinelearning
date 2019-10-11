import org.junit.*;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;


/**
 * Test for the complex number class.
 * 
 * testConstructor1Param - test the 1 parameter constructor
 * testConstructor2Param - test the 2 parameter constructor
 * testAddRealAndComplexNum - addition of a complex number with a real number
 * testAdd2ComplexNums - addition of two complex numbers
 * testMultiply2ComplexNums - multiplication of two complex numbers
 * testMultiplyRealAndComplexNum - multiplication of a complex number with a
 * real number testAbsoluteValue - absolute value of a complex number
 *
 * @author TODO Your Name
 * @version TODO Date
 * @author Period: TODO Your Period
 * @author Assignment: JMCh09Ex17_Complex
 *
 * @author Sources: TODO List collaborators
 */
public class ComplexJUTest extends junit.framework.TestCase
{

    @Test
    public void testConstructor1Param()
    {
        Complex x = new Complex( 2.0 );
        assertEquals( "2.0 + 0.0i", x.toString() );

    }


    @Test
    public void testConstructor2Param()
    {
        Complex x1 = new Complex( 2.0, 4.0 );
        assertEquals( "2.0 + 4.0i", x1.toString() );

    }

    Complex y = new Complex( 2.0, 5.0 );


    @Test
    public void testAddRealAndComplexNum()
    {
        Complex y1 = y.add( 2.0 );
        assertEquals( "4.0 + 5.0i", y1.toString() );
    }


    @Test
    public void testAdd2ComplexNums()
    {
        Complex v = new Complex( 2.0, 4.0 );
        Complex w = new Complex( 3.0, 1.0 );
        Complex vw = v.add( w );
        assertEquals( "5.0 + 5.0i", vw.toString() );
    }


    @Test
    public void testMultiply2ComplexNums()
    {
        Complex c = new Complex( 1.0, 3.0 );
        Complex d = new Complex( 2.0, 1.0 );
        Complex cd = c.multiply( d );
        assertEquals( "-1.0 + 7.0i", cd.toString() );
    }


    @Test
    public void testMultiplyRealAndComplexNum()
    {
        Complex f = new Complex( 2.0, 3.0 );
        Complex f1 = f.multiply( 5.0 );
        assertEquals( "10.0 + 15.0i", f1.toString() );
    }


    @Test
    public void testAbsoluteValue()
    {
        Complex j = new Complex( 3.0, 4.0 );
        assertEquals( 5.0, j.abs() );
    }


    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter( ComplexJUTest.class );
    }


    public static void main( String args[] )
    {
        org.junit.runner.JUnitCore.main( "ComplexJUTest" );
    }
}
