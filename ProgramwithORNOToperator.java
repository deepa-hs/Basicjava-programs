package basicsprogram;

public class ProgramwithORNOToperator {
	public static void main(String [] args)
	{
		int a=10;
		int b=20;
		if(!(a>b || b==100))
		{
			System.out.println("Block 1");
		}
		else
		{
			System.out.println("Block 2");
		}
	}

}


