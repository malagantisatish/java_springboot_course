
interface A { // interface will show you the design and we need to implement the methods 

    void show();  // this is like public abstract void show();
    // in interface by defacult public abstract is there

    void config();

    int age = 25;
    String area = "prathipadu"; // all variables should final and static by default

}

interface X {

    void run();

}

interface Y extends X { // extending interface we use this extends 

}

class B implements A, Y { // we can multiple interfaces like this

    public void show() {

    }

    public void config() {
    }

    public void run() { // this from Y interface

    }
}

// class--class---->extends
// class---interface--->implements
//interface--interface--->extends





public class Interface {

    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        // obj.area = "hyderabad"; it won't work due its final 

        System.out.println(obj.area);

        // obj.run(); // it  raises an error due to type  for excuting run method we need to define it with interface X
        X obj1 = new B(); // here i am creating a new obj with type x
        obj1.run();
    }

}
