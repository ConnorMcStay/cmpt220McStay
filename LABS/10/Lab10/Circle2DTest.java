
public class Circle2DTest {

	public static void main(String[] args) {


        Circle2D c1 = new Circle2D(2, 2, 5.5);
        Circle2D c2 = new Circle2D(5, 4, 9);

    //    System.out.println("C1 area = " + c1.getArea() + " perimeter = " + c1.getPerimeter());
      //  System.out.println("Does c1 contain coordinate (3,3)? " + c1.contains(3, 3));
        //System.out.println("Does c1 contain circle 2? " + c1.contains(new Circle2D(4, 5, 10.5)));
        //System.out.println("Does c1 overlap circle 3? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
        
        System.out.println("The circle that is larger is " + ((Circle2D)(GeometricObject.max(c1, c2))).getRadius() );

    }

}