
package triangle;


public class Triangle {
    private int height=0;
    private int breadth=0;
    private int length=0;
    
    public Triangle()
    {
        
    }
    public Triangle(int x,int y,int z)
    {
        this.height=x;
        this.breadth=y;
        this.length=z;
    }
    public void showInfo()
    {
        System.out.println("height: "+this.height);
        System.out.println("breadth: "+this.breadth);
        System.out.println("length: "+this.length);
    }
    public void testTriangle()
    {
        if(height==breadth && breadth==length)
        {
            System.out.println("Equilateral");
        }
        else if(height==breadth || height==length||length==breadth)
        {
            System.out.println("isosceles");
        }
        else
        {
            System.out.println("no equal sides");
        }
    }
    
}
