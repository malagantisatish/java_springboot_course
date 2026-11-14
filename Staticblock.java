
class Mobile {

    String brand; // instance variable
    int price; // instance variable
    static String name; // static variable

    //static block
// for giving initial values we will use
    static { // this will only call one how many obj you create
        // this block will execute first not bcz of order
        name = "phone";
        System.out.println("static");
    }

    public Mobile() {  // this will call each time when we are creating an new instance
        brand = "";
        price = 200;
        System.out.println("constructor");
    }

    public void show() { // instance method
        System.out.println(brand + " " + price + " " + name);
    }

    public static void show1() { // static method

    }
}

public class Staticblock {

    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();

    }

}
