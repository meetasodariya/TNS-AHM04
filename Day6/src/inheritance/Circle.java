package inheritance;

public class Circle extends Shape {
	private double radious;

	public Circle(double radious) {
		super();
		this.radious = radious;
	}

	@Override
	public double getParameter() {
		// TODO Auto-generated method stub
		
		return 2 * 3.14 * radious;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * 3.14;
	}
	
	
}
