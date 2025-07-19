package basicsprogram;
class Animal{
	void add(){
		System.out.println("Animal parent");
		}
}
class Dog extends Animal{
	void sub() {
		System.out.println("Dog is a Animal");
	}
}
public class Assignment24 extends Animal{
	static void mul() {
		System.out.println("Animals");
	}

	public static void main(String[] args) {
		Assignment24 a1=new Assignment24();
		Assignment24 c1=new Assignment24();
		Dog b1=new Dog();
		a1.add();
		b1.sub();
		c1.mul();
	}

}
