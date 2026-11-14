
class A {

    int age;

    public void show() {
        System.out.println("in a show method");
    }

    class B { // its a dynamic class

        public void config() {
            System.out.println("in class b config");
        }
    }

    static class C { // static can we used for inner class only

        public void callC() {
            System.out.println("in inner static class c");
        }
    }

}

public class InnerClass {

    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        // B obj =  new B();//it won't work due to it inside the A class
        A.B obj1 = obj.new B(); // ro4 non static inner class
        obj1.config();

        A.C objc = new A.C(); // for static inner class;
        objc.callC();

    }
}
