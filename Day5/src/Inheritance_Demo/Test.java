package Inheritance_Demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1= new Car();
		c1.setType_of_vehicle("Fourwheeler");
		
	}

	@Override
	public String toString() {
		return "Test [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
