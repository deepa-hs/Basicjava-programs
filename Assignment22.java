package basicsprogram;
class animals{
	void animal(){
		System.out.println("animals");
	}
}
class dog extends animals{
	void dogs() {
		System.out.println("dogs");
	}
}
public class Assignment22 extends dog{
	void puppy() {
	System.out.println("puppies");
	}
	public static void main(String[] args) {
		Assignment22 a1=new Assignment22();
		a1.animal();
		a1.dogs();
		a1.puppy();
	}
}

