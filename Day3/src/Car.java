/* 1. First letter of class is always capital
 * 2. MAke data member private
 * 3. Make member function public
 * 
 *  */
//class Engine{
//	//data members
//	private String type_fuel;
//	
//	//member functions
//	public void type_fuel_msg() {
//		type_fuel="fff";
//		System.out.println(type_fuel);
//	}
//}

import java.util.*;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Engine e1 = new Engine();
//		e1.type_fuel_msg();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int set_no = sc.nextInt();
		System.out.println("Enter number: ");
		int setNo1 = sc.nextInt();
		
		Calculator c1= new Calculator();
		c1.set_no(set_no);
//		System.out.println(c1.get_no());
		c1.setNo1(setNo1);
		c1.sname = "calculator";
//		System.out.println(c1.getNo1());
		System.out.println(c1.toString());
		System.out.println("Addition:"+c1.add());
		System.out.println("Subtraction:"+c1.sub());
		System.out.println("Multiplication:"+c1.mul());
		System.out.println("Divison:"+c1.div());
	}

}
