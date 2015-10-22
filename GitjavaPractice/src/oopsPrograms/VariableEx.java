package oopsPrograms;

public class VariableEx 
{
int a=50;//instance variable
static int c=40;//static variable
public void var()
{
	int q=30;//local variable
	System.out.println(q);
}
	public static void main(String[] args) {
		
		VariableEx v=new VariableEx ();
		v.var();
	}

}
//Output:30

//A variable that is declared inside the method is called local variable.
/*A variable that is declared inside the class but outside the method is called 
instance variable . It is not declared as static.*/
//A variable that is declared as static is called static variable. It cannot be local.
