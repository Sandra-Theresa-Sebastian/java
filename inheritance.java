import java.util.Scanner;
class Employee
{
	String name;
	int age;
	long phonenumber;
	float salary;
	String address;
	Employee(String name1,int age1,long phonenumber1,float salary1,String address1)
	{
			name=name1;
			age=age1;
			phonenumber=phonenumber1;
			salary=salary1;
			address=address1;
	}
	void printEmployee()
	{
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("Phone number:"+phonenumber);
			System.out.println("Address:"+address);
	}
	void printsalary()
	{
		System.out.println("Salary:"+salary);
	}
}
class officer extends Employee
{
	String specialization;
	officer(String name1,int age1,long phonenumber1,float salary1,String address1,String specialization1)
	{
		super(name1,age1,phonenumber1,salary1,address1);
		specialization=specialization1;
	}
	void printspecialization()
	{
		System.out.println("specialization="+specialization);
	}
}
class Manager extends Employee
{
	String department;
	Manager(String name1,int age1,long phonenumber1,float salary1,String address1,String department1)
	{
		super(name1,age1,phonenumber1,salary1,address1);
		department=department1;
	}
	void printdepartment()
	{
		System.out.println("department="+department);
	}
}
public class inheritance 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int age = 0;
		String name,address,specialization,department;
		float salary;
		long phonenumber;
		System.out.println("Enter the details Of Officer: ");
		System.out.println("Enter the name: ");
		name=sc.next();
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		System.out.println("Enter the phone number: ");
		phonenumber=sc.nextLong();
		System.out.println("Enter the address: ");
		address=sc.next();
		System.out.println("Enter the salary: ");
		salary=sc.nextFloat();
		System.out.println("Enter the specialization: ");
		specialization=sc.next();

		officer O=new officer(name,age,phonenumber,salary,address,specialization);
		System.out.println("Enter the details Of Manager: ");
		System.out.println("Enter the name: ");
		name=sc.next();
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		System.out.println("Enter the phone number: ");
		phonenumber=sc.nextInt();
		System.out.println("Enter the address: ");
		address=sc.next();
		System.out.println("Enter the salary: ");
		salary=sc.nextFloat();
		System.out.println("Enter the department: ");
		department=sc.next();

		Manager m=new Manager(name,age,phonenumber,salary,address,department);
		System.out.print("Details Of Officer");
		O.printEmployee();
		O.printsalary();
		O.printspecialization();
		System.out.print("Details Of Manager");
		m.printEmployee();
		m.printsalary();
		m.printdepartment();
		sc.close();
	                                                 }
}