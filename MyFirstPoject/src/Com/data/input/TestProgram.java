package Com.data.input;

import java.util.Scanner;

public class TestProgram{
		public static void main(String []args) {	
			Scanner ob=new Scanner(System.in);
			Long a,b;
			float c,d;
			String name;
			System.out.println("Enter Value of a:");
		a=ob.nextLong();
		System.out.println("Enter Value of b:");
		b=ob.nextLong();
		System.out.println("Enter Value of c:");
		c=ob.nextFloat();
		System.out.println("Enter Value of d:");
		d=ob.nextFloat();
		System.out.println("Enter the name:");

		name=ob.next();
		System.out.println("Addition"+(a+b));
		System.out.println("Addition"+(c+d));
		System.out.println("name");
		ob.close();

		

	}

}
