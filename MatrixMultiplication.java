import java.util.Scanner;
public class MatrixMultiplication
{
	public static void main(String args[]) 
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("No. of rows in matrix m1: ");
		int m1=sc.nextInt();
		System.out.println("No. of coloumns in matrix n1: ");
		int n1=sc.nextInt();
		System.out.println("No. of rows in matrix m2: ");
		int m2=sc.nextInt();
		System.out.println("No. of coloumns in matrix n2: ");
		int n2=sc.nextInt();
		if (n1!=m2)
		{
			System.out.println("Matrix multiplication not possible");
			return;
		}
		int i,j,k;
		int A[][]=new int[m1][n1];
		int B[][]=new int[m2][n2];
		int C[][]=new int [m1][n2];
		System.out.println("Read matrix A ");
		for (i=0;i<m1;i++)
		{
			for( j=0;j<n1;j++)
			{
				System.out.println("A["+i+"]["+j+"]=");
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("Read matrix B ");
		for (i=0;i<m2;i++)
		{
			for (j=0;j<n2;j++)
			{
				System.out.println("B["+i+"]["+j+"]=");
				B[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<m1;i++)
		{
			for( j=0;j<n2;j++)
			{
				C[i][j]=0;
				for( k=0;k<n1;k++)
				{
					C[i][j]=A[i][k]*B[k][j];
				}
			}
		}
		System.out.println("Matrix A ");		
		for(i=0;i<m1;i++)
		{
			for( j=0;j<n1;j++)
			{
				System.out.print(A[i][j]+"\t");	
			}
			System.out.println();	
		}
		System.out.println("Matrix B ");
		for ( i=0;i<m2;i++)
		{
			for( j=0;j<n2;j++)
			{
				System.out.print(B[i][j]+"\t");				
			}
			System.out.println();
		}
		System.out.println("Matrix C ");
		for ( i=0;i<m1;i++)
		{
			for( j=0;j<n2;j++)
			{
				System.out.print(C[i][j]+"\t");				
			}
			System.out.println();
		}						
	}	
}