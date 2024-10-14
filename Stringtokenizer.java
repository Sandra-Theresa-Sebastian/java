import java.util.Scanner;
import java.util.StringTokenizer;
public class Stringtokenizer 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the integer with one space gap:");
		String s=scanner.nextLine();
		StringTokenizer st=new StringTokenizer(s);
		int n,sum=0;
		while(st.hasMoreTokens())
		{
			String a=st.nextToken();
			n=Integer.parseInt(a);
			System.out.println(n);
			sum+=n;
		}
		System.out.println("Sum of integers="+sum);
		scanner.close();
	}
}