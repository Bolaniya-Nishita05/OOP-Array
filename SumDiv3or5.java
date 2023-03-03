import java.util.Scanner;

public class SumDiv3or5
{
	public static void main(String[] args)
	{
		System.out.println("ENTER TOTAL NO. OF ELEMENTS OF ARRAY= ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int no[]=new int [n];

		int sum=0;

		for(int i=0;i<n;i++)
		{
			System.out.println("ENTER ELEMENT= ");
			no[i]=sc.nextInt();

			if(no[i]%3==0 || no[i]%5==0)
			{
				sum=sum+no[i];
			}
		}

		System.out.println("SUM OF NO. DIVISIBLE BY 3 OR 5= "+sum);	
	}
}