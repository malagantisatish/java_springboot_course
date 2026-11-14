
abstract class Car {

    // if we need to use abstract key for method we should define class with abstract keyword 
    public Car() {
        // contructor
    }

    public abstract void drive(); // here we are declaring
// if we are using curly brackets{} it means we are defining a func

    public void playMusic() {

        System.out.println("play music...");

    }
}

// by using abstrct keyword in this Car class we just need declare a method
// but in sup class we should define the Car method
class Tata extends Car {

    public void drive() {
        System.out.println("drive");
    }
}

public class AbstractKeyword {

    public static void main(String a[]) {

        Car carObj = new Tata();
        carObj.drive();
        carObj.playMusic();

    }
}
