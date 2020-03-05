
package triangle;


public class MainClass {

   
    public static void main(String[] args) {
       
        Triangle t1=new Triangle(4,4,4);
        Triangle t2=new Triangle(2,2,1);
        Triangle t3=new Triangle(1,2,3);
        t1.showInfo();
        t1.testTriangle();
        t2.showInfo();
        t2.testTriangle();
        t3.showInfo();
        t3.testTriangle();
    }
    
}
