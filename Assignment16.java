package basicsprogram;

public class Assignment16 {
	static void add()
	{
		int a=20;
		int b=30;
		System.out.println(a+b);
	}
	
	static void add(int c, int d)
	{
		System.out.println(c*d);
	}
	void sub()
	{
		int e=30;
		int f=20;
		System.out.println(e-f);
	}
	void sub(int g, int h)
	{
		System.out.println(g-h);	
	}
	
	public static void main(String[] args) {
		add();
		add(20,40);
		Assignment16 n1=new Assignment16();
		n1.sub();
		n1.sub(40,20);	
	}

}
