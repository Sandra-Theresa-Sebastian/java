import java.util.Scanner;
class Method
{
	void area(double r)
	{
		System.out.println("The Area of Circle= "+3.14*r*r);
	}
	void area(int l,int w)
	{
		System.out.println("The Area of Rectangle= "+l*w);
	}
	void area(double b, double h)
	{
		System.out.println("The Area of Triangle= "+0.5*b*h);
	}
}
public class MethodOverloading 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Method m=new Method();
		System.out.println("Enter the radius of the Circle= ");
		double r =sc.nextDouble();
		m.area(r);
		System.out.println("Enter the Length and Breadth of Rectangle= ");
		int l=sc.nextInt();
		int w=sc.nextInt();
		m.area(l,w);
		System.out.println("Enter the Base and Height of a Triangle= ");
		double b =sc.nextDouble();
		double h =sc.nextDouble();
		m.area(b,h);
	}
}