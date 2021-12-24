package Com.data.input;

public class OperatorTest {

	public static void main(String[] args) { 
	int a=34 ,b=45 ,c=65 ,x=10;
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	
	
	System.out.println(a>b && b>c);//and
	System.out.println(a>b || b>c);//or
	System.out.println(a!=b);//not
	System.out.println(a==b);//equality
	
	
	a+=5;//a=a+5;
	System.out.println(a);
	a-=5;//a=a-5;
	System.out.println(a);
	a*=2;//a=a*2;
	System.out.println(a);
	a/=4;//a=a/4;
	System.out.println(a);
	
	System.out.println(a & b);//bitwise and operator
	System.out.println(a | b);//bitwise or
	System.out.println(a >> 2);// right shift
	System.out.println(a << 2);//left shift
	
	
	System.out.println(x++ + ++x - x--);//10
	
	int y=(20>30)?20:30;
	System.out.println(y);
	
	String s=(20<30)?"java":"c++";
     System.out.println(s);
	}

}
