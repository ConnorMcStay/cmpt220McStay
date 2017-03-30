import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the three sides of a triangle");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		System.out.print("what color is the triangle?");
		String color = input.next();
		System.out.print("is the triangle filled? [true, false]");
		boolean filled = input.nextBoolean();
		
		Triangle triangle=new Triangle(side1 , side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		System.out.println(" the area is " + triangle.getArea());
		System.out.println(" the perimiter is " + triangle.getPerimeter());
		System.out.println(" the color is " + triangle.getColor());
		System.out.println(" the triangle is filled " + triangle.isFilled());
		
		
	}

}
