class Pattern13
{
	public static void main(String[]args)
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==1||i==9||j==1||j==9)
					System.out.print("F ");	
				else if(j==2||j==8||i==2||i==8)
					System.out.print("L ");
				else if((j==3||j==7||i==3||i==7))
					System.out.print("I ");
				else if(j==4||j==6||i==4||j==6)
					System.out.print("C ");
				else if(i==j)
					System.out.print("K ");
				else
					System.out.print("C ");
			}
						System.out.println();
		}
	}
}