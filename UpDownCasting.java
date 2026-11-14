
class A { // a does it know b existed or not

    public void show1() {
        System.out.println("in a show");

    }
}

class B extends A {

    public void show2() {
        System.out.println("in B show");
    }
}

public class UpDownCasting {

    public static void main(String a[]) {
        double d = 4.5;
        int num = (int) d; // if we  assign directly it shows the error that if we convert we might miss some data
        System.out.println(d);

        A obj = new A();
        obj.show1();

        A objB = (A) new B();// upcasting 
        objB.show1();

        B objA = (B) objB; // down casting
        objA.show2();

        //called as type casting
    }

}
