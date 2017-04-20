
public class TestRectangle {

	public static void main(String[] args) {

		 Rectangle c1 = new Rectangle(2, 2);
	     Rectangle c2 = new Rectangle(5, 4);

	     
	     System.out.println("The rectangle that is larger is " + ((Rectangle)(GeometricObject.max(c1, c2))).getPerimiter() );
	}

}
