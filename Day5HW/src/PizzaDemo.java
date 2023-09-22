import java.util.*;
public class PizzaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of pizza: ");
		String size = sc.next();
		
		System.out.println("Enter No of cheese Slices: ");
		int noOfCheese = sc.nextInt();
		
		System.out.println("Enter No of peperoni: ");
		int noOfPeperoni = sc.nextInt();
		
		System.out.println("Enter No of Ham: ");
		int noOfHam = sc.nextInt();
		
		
		
		Pizza p1 = new Pizza(size, noOfCheese, noOfPeperoni, noOfHam);
		p1.setSize(size);
		p1.setNoOfChees(noOfCheese);
		p1.setNoOfPeperoni(noOfPeperoni);
		p1.setNoOfHam(noOfHam);
		
		System.out.println(p1.toString());
		System.out.println(p1.getDescription());
		System.out.println("Total Amount to Pay: $"+p1.calcCost());
		sc.close();
		
	}

}
