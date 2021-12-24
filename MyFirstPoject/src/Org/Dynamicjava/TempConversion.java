package Org.Dynamicjava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TempConversion {
public static void main(String[]args) throws NumberFormatException,IOException{
	InputStreamReader in=new InputStreamReader(System.in);
	BufferedReader ob=new BufferedReader(in);
	Double c,f;
	System.out.println("Enter the value of fahrenheit:");
	f=Double.parseDouble(ob.readLine());
	c=(f-32)/9*5;
	System.out.println("Temperature in celcius is:"+c);
	

	}

}
