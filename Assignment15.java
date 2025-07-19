package basicsprogram;

public class Assignment15 {
	Assignment15(String name)
	{
		System.out.println("Name:" +name);
	}
	Assignment15(int a)
	{
		System.out.println("age:" +a);
	}
	Assignment15(long mobilenumber)
	{
		System.out.println("mobilenumber:" +mobilenumber);
	}
	public static void main(String[] args) {
		Assignment15 n1= new Assignment15("Deepa");
		Assignment15 a2 = new Assignment15(25);
		Assignment15 m3 = new Assignment15("2345678989");

	}

}
