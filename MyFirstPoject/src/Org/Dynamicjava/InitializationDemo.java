package Org.Dynamicjava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InitializationDemo {

	public static void main(String[] args) throws NumberFormatException,IOException {
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		long a,b;
		System.out.println("Enter value of a:");
		a=Long.parseLong(ob.readLine());
		System.out.println("Enter value of b:");
		b=Long.parseLong(ob.readLine());
		System.out.println(a+b);
		
		System.out.println("This is an example of error Stream");
		

	}

}
