package testabstraction1;

/**
 *
 * @author sony
 */
abstract class Shape
{
    abstract void draw();
}
class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("Going to draw Rectangle");
    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("Going to draw a circle");
    }
}
public class TestAbstraction1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.draw(); /*Going to draw Rectangle*/
    }
    
}
