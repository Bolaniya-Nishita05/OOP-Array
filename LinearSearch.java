import java.util.Scanner;

public class LinearSearch
{
	public static void main(String[] args)
	{
		System.out.println("ENTER TOTAL NO. OF ELEMENTS OF ARRAY= ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int no[]=new int [n];

		for(int i=0;i<n;i++)
		{
			System.out.println("ENTER ELEMENT= ");
			no[i]=sc.nextInt();
		}

		System.out.println("ENTER NO. TO BE FOUND= ");
		int find=sc.nextInt();
		int place=0;
		int count=0;

		for(int i=0;i<n;i++)
		{
			if(no[i]==find)
			{
				place=i+1;
				System.out.println("NO. FOUND AT "+place);
				count++;
			}
		}

		if(place==0)
		{
			System.out.println("NO.NOT FOUND");
		}

		System.out.println("TOTAL NO. OF TIMES NO. FOUND= "+count);	
	}
}