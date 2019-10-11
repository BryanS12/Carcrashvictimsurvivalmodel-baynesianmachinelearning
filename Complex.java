/**
 * Represents a complex number of the form a + bi. Provides methods for adding,
 * multiplying and calculating the absolute value.
 *
 * @author TODO Your Name
 * @version TODO Date
 * @author Period: TODO Your Period
 * @author Assignment: JMCh09Ex17_Complex
 *
 * @author Sources: TODO List collaborators
 */
public class Complex
{

    private double a;

    private double b;

    /**
     * complex number
     * @param a double
     */
    public Complex( double a )
    {
        this.a = a;
        b = 0.0;

    }

    /**
     * makes a complex num
     * @param a number
     * @param b imaginary
     */
    public Complex( double a, double b )
    {
        this.a = a;
        this.b = b;
    }


    /**
     * 
     * TODO returns the abs
     * @return abs
     */
    public double abs()
    {
        double x = Math.sqrt( ( a * a ) + ( b * b ) );
        return x;
    }

    /**
     * 
     *  adds complex numbers
     * @param other complex num
     * @return sum
     */
    public Complex add( Complex other )
    {
        double x = this.a + other.a;
        double y = this.b + other.b;
        return new Complex( x, y );
    }

    /**
     * 
     * multiplies complex number
     * @param other complex num
     * @return product
     */
    public Complex multiply( Complex other )
    {
        double x = ( a * other.a ) - ( b * other.b );
        double y = ( b * other.a + a * other.b );
        return new Complex( x, y );
    }

    /**
     * @return string
     */
    
    public String toString()
    {
        return a + " + " + b + "i";
    }

    /**
     * 
     * adds complex numbers
     * @param x a double
     * @return product
     */
    public Complex add( double x )
    {
        double y = a + x;
        return new Complex( y, b );
    }

    /**
     * 
     * multiplies complex number
     * @param z multiple
     * @return product
     */
    public Complex multiply( double z )
    {
        double y = this.a * z;
        double x = this.b * z;
        return new Complex( y, x );
    }

}
