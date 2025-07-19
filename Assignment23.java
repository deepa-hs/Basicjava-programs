package basicsprogram;
interface Animals{
	static void animal() {
		System.out.println("animals");
	}
}
interface Dogs{
	static void dog() {
		System.out.println("Dog is a animal");
	}
}
public class Assignment23 implements Animals,Dogs{
	static void add()
	{
		System.out.println("Animals sounds");
	}
	public static void main(String[] args) {
		Animals.animal();
		Dogs.dog();
		Assignment23.add();
	}
}
