
class Mobile {

    String brand;
    int price;
    static String name;

    public static void show(Mobile obj) {
        // in static method we can not use normal variable bcz 
        // we can access this method direclty also in that i will get confuse so that
        // but we can send it by props 
        System.out.println(name + " " + obj.price + " " + obj.brand);
    }

    public void show1() {
        System.out.println("normal method");
    }

}

public class StaticMethod {

    public static void main(String[] args) {

        Mobile obj1 = new Mobile();

        // to call normal we need reference variable obj1
        obj1.show1();

        // and we should not call it directly but in case of static we can call it directly
        Mobile.show(obj1);

    }

}
