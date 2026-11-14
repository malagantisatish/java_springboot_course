
class Mobile {

    String brand;
    int price;
    // String name;
    // if i want name should same for all refernce object then i will use static variable while declaring a variable like below
    static String name;

    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }

}

public class StaticVariable {

    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "apple";
        obj1.name = "smart phone";
        obj1.price = 200;

        Mobile obj2 = new Mobile();
        obj2.brand = "iq";
        obj2.name = "smart phone";
        obj2.price = 2100;

        obj1.name = "IQ00"; // bcz of declaring a variable with static for both object the name will be IQ00

        // and while sending static varible we need to use classs name instead of object name
        Mobile.name = "Nokia";

        obj1.show();
        obj2.show();

    }

}
