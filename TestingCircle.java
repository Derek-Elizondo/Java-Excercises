package tareajava;

public class TestingCircle extends Circle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle1 = new Circle(1.0);
		Circle circle2 = new Circle(2.0);
		
		System.out.println("The circle 1 has a radius of "+ circle1.getRadius()+ " and an area of " );
		System.out.println("The circle 2 has a radius of "+ circle2.getRadius()+ " and an area of " );
		
		
		
		circle1.setRadius(3);
		circle1.setColor("red");
		
		System.out.println(circle1.toString());
		
		circle2.setRadius(5);
		circle2.setColor("blue");
		
		System.out.println(circle2.toString());
	}

}
