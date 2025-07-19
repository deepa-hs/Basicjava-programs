package basicsprogram;

public class ProgramonnestedifElseBlock {
	public static void main(String [] args)
	{
		int a=10;
		int b=20;
		int c=30;
		if(a<b)
		{
			if(b<c)
			{
				System.out.println("Block 1");
			}
			else
			{
				System.out.println("Block 2");
			}
		}
		else
		{
			System.out.println("Block 3");
		}
	}

}
