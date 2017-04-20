
public abstract class GeometricObject implements Comparable<GeometricObject>  {
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	public GeometricObject(String color , boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color; 
		this.filled = filled; 
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	public String toString(){
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	public static GeometricObject max(GeometricObject object1, GeometricObject object2) {
		if(object1.compareTo(object2) < 0) 
			return object2; 
		else
			return object1;  
	}
	public static double sumArea(GeometricObject[] a) {

        double sum = 0;

        for (GeometricObject o : a) {

            sum += o.getArea();

        }
        return sum;

    }
    public abstract double getArea();
    public abstract double getPerimeter();
	public int compareTo(Octagon o) {
		// TODO Auto-generated method stub
		return 0;
	}

}