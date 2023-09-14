package Proj1;
import java.util.Scanner;

public class First_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
		int a=45;
		int b=89;
		int c=35;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		a = sc.nextInt();
		System.out.println("Enter another number: ");
		b = sc.nextInt();
		System.out.println("Enter third number: ");
		c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("bigger number is " +a);
		}
		else if(b>c) {
				System.out.println("bigger number is " +b);
			}
		else {
			System.out.println("bigger number is " +c);
		}
	}

}
