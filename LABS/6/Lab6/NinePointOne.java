
public class NinePointOne {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,40);
		Rectangle r2 = new Rectangle(3.5,35.9);
	
		System.out.println("the width of rectangle 1 is " + r1.width);
		System.out.println("the height of rectangle 1 is " + r1.height);
		System.out.println("the area of rectangle 1 is " + r1.getArea());
		System.out.println("the perimeter of rectangle 1 is " + r1.getPerimiter());
		
		System.out.println("the width of rectangle 2 is " + r2.width);
		System.out.println("the height of rectangle 2 is " + r2.height);
		System.out.println("the area of rectangle 2 is " + r2.getArea());
		System.out.println("the perimeter of rectangle 2 is " + r2.getPerimiter());
	}
	
	
}