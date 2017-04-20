
public class Rectangle extends GeometricObject {

		 double width = 1;
		 double height = 1; 
		
		public Rectangle() {
		} 
		public Rectangle(double width, double height){
			this.width = width; 
			this.height = height; 
		}
		public double getArea() {
			return width * height ; 
			
		}
		public double getPerimiter() {
			return 2 * (width + height);
		}
		@Override
		public int compareTo(GeometricObject o) {
			if (getPerimiter() < ((Rectangle)o).getPerimiter())
				
				return -1;
			else if (getPerimiter() == ((Rectangle)o).getPerimiter()) 
				return 0; 
			else 
				return 1; 
		}
	}

