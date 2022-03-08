package tareajava;

class Circle {
	private String color;
	private double radius;
	
	public Circle() {}
	public Circle(double r) {
		this.radius = r;
	}
	public Circle(double r, String c) {
		this.radius = r;
		this.color = c;
	}
	
	
			
	
	
	public double getRadius() {
		return this.radius;
	}
	
	public String getColor() {
		return this.color;
	}
	public double getArea() {
		double area = 0;
		area = (radius*radius)*Math.PI;
		return area;
		
	}
	
	public void setRadius(double r ) {
		this.radius = r;
	}
	public void setColor(String c ) {
		this.color = c;
	}
	
	public String toString(){
		return ( "The circle has a radius of "+getRadius()+"and is the color "+getColor()+". It has an area of"+getArea());
	}
	

		
}





