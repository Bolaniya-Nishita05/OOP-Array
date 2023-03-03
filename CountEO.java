import java.util.Scanner;

public class CountEO
{
	public static void main(String[] args)
	{
    	System.out.println("ENTER TOTAL NO. OF ELEMENTS OF ARRAY= ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int no[]=new int [n];

		int even=0,odd=0;

		for(int i=0;i<n;i++)
		{
			System.out.println("ENTER ELEMENT= ");
			no[i]=sc.nextInt();

			if(no[i]%2==0)
			{
				even++;
			}

			else
			{
				odd++;
			}
		}

		System.out.println("TOTAL EVEN ELEMENTS= "+even);
		System.out.println("TOTAL ODD ELEMENTS= "+odd);
	}
}