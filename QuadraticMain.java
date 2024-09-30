import java.util.Scanner;
import java.lang.Math; 

class Quadratic{
	int a,b,c;
	double root1,root2,realpart,imagpart,d;
	

	void getd()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a");
	a=sc.nextInt();
	System.out.println("Enter the value of b");
	b=sc.nextInt();
	System.out.println("Enter the value of c");
	c=sc.nextInt();
}

	void compute()
{
	d=b*b-4*a*c;
	if(d==0)
{
	root1=root2=-b/(2*a);
	System.out.println("Roots are equal");
	System.out.println("Root1="+root1);
	System.out.println("Root2="+root2);
}
	else if(d>0)
{	System.out.println("Roots are real and different");

	root1=(-b+Math.sqrt(d))/(2.0*a);
	root2=(-b-Math.sqrt(d))/(2.0*a);

	System.out.println("Root1="+root1);
	System.out.println("Root2="+root2);
}
	else if(d<0)
{
	System.out.println("Roots are imaginary");
	realpart=-b/(2*a);
	imagpart = Math.sqrt(-d) / (2.0 * a);
	System.out.println("Root1= " + realpart + " + " + imagpart + "i");
	System.out.println("Root2= " + realpart + " - " + imagpart + "i");
 
}
}}
class QuadraticMain{

	public static void main(String args[])
{
	Quadratic q=new Quadratic();
	q.getd();
	q.compute();
	
}
}
