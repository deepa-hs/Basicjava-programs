package basicsprogram;
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    void display() {
        System.out.println("This is a vehicle");
    }
}
class Car extends Vehicle {
    Car() {
        super();
        System.out.println("Car constructor called");
    }

    void display() {
        super.display();
        System.out.println("This is a car");
    }
}
public class Assignment26 {
    public static void main(String[] args) {
        Car myCar = new Car();     
        myCar.display();           
    }
}

