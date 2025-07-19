package basicsprogram;
class animal{
	void colour() {
		System.out.println("Colour is White");
	}
}
public class Assignment21 extends animal{
	void sound() {
		System.out.println("Sounds loud");
	}

	public static void main(String[] args) {
		Assignment21 b1=new Assignment21();
		b1.colour();
		b1.sound();
	}

}
