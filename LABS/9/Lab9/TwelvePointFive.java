
public class TwelvePointFive {

	public static void main(String[] args) {
		
		try {
			Triangle triangle = new Triangle (1,1,3);
		}catch (IllegalTriangleException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
