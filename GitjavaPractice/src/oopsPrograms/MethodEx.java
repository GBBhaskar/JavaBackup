package oopsPrograms;

public class MethodEx 
{
 public void add()//Method name should start with small letter
 {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("addition is:"+c);
 }
	public static void main (String []args)
	{
		System.out.println("Example for method");
		MethodEx m=new MethodEx();
		m.add();
	}
	
	}
	

/*Output:
 * Example for method
addition is:30
*/
 